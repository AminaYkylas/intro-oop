public class Employee extends Human implements IStudy, IWork {
    private String job;
    private float salary;

    public static int count = 0;

    public Employee(int age, String name, boolean isMale, String job, float salary) {
        super(age, name, isMale);
        this.job = job;
        this.salary = salary;
        count++;
    }

    public String getJob() {
        return job;
    }

    public float getSalary() {
        return salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String getType() {
        return "Employee";
    }

    @Override
    public void introduce() {
        System.out.println("Hello! I'm " + name + ", I work as " + job);
    }

    @Override
    public void learn() {
        System.out.println(name + " is learning new skills for work");
    }

    @Override
    public void exam() {
        System.out.println(name + " is taking work exam");
    }

    @Override
    public void doWork() {
        System.out.println(name + " is working as " + job);
    }

    @Override
    public void receiveSalary() {
        System.out.println(name + " gets salary: " + salary);
    }
}
