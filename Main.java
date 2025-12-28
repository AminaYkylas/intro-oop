import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int empAge = scanner.nextInt();
        System.out.print("Enter employee gender (true=male, false=female): ");
        boolean empGender = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Enter employee position: ");
        String empPosition = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        float empSalary = scanner.nextFloat();
        scanner.nextLine();

        Employee emp = new Employee(empAge, empName, empGender, empPosition, empSalary);
        Student stu = new Student(18, "Amina", false, "MT", 3.0f);

        Human h = stu;
        Student s = stu;
        IStudy i = stu;
        IWork w = emp;

        System.out.println("Human methods");
        h.show();
        h.introduce();

        System.out.println("Student methods");
        s.show();
        s.introduce();
        s.learn();
        s.exam();
        s.showId();

        System.out.println("Employee methods");
        emp.show();
        emp.introduce();
        emp.learn();
        emp.exam();
        emp.doWork();
        emp.receiveSalary();

        System.out.println("Interface methods");
        i.learn();
        w.doWork();

        System.out.println("Old salary: " + emp.getSalary());
        emp.setSalary(emp.getSalary() + 52000);
        System.out.println("New salary: " + emp.getSalary());

        System.out.println("Total employees: " + Employee.count);
    }
}
