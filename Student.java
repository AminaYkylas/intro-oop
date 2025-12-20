public class Student extends Human{
    String study;
    float score;

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
}
