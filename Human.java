public class Human {
    int age;
    String name;
    boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public boolean isMale() {
        return isMale;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void show() {
        System.out.println(name + " (" + age + " years)");
    }

    public String getType() {
        return "Human";
    }

}

