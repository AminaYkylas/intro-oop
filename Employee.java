public class Employee extends Human{
    String job;
    float money;

    public static int count = 0;

    public Employee(int age, String name, boolean isMale, String job, float money) {
        super(age, name, isMale);
        this.job = job;
        this.money = money;
        count++;
    }

    public String getJob() {
        return job;
    }
    public float getMoney() {
        return money;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String getType() {
        return "Employee";
    }


}
