public final class Student extends Human implements IStudy {
    private String study;
    private float score;

    private final String studentId = "A27101403";

    public Student(int age, String name, boolean isMale, String study, float score) {
        super(age, name, isMale);
        this.study = study;
        this.score = score;
    }

    public String getStudy() {
        return study;
    }

    public float getScore() {
        return score;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String getType() {
        return "Student";
    }

    public final void showId() {
        System.out.println("My ID: " + studentId);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student studying " + study);
    }

    @Override
    public void learn() {
        System.out.println(name + " is studying " + study);
    }

    @Override
    public void exam() {
        System.out.println(name + " is taking exam");
    }
}
