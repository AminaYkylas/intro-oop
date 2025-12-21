import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        Employee employee = new Employee(empAge, empName, empGender, empPosition, empSalary);

        Human human = new Human(30, "Alimok", true);
        Student student = new Student(20, "Sabok", false, "Computer Science", 3.8f);


        System.out.println("Employee salary: " + employee.getMoney());
        System.out.println("Student score: " + student.getScore());

        employee.setMoney(employee.getMoney() + 1000);
        student.setScore(student.getScore() + 0.5f);

        System.out.println("New salary: " + employee.getMoney());
        System.out.println("New score: " + student.getScore());
        

        human.show();
