public class Main {
    public static void main(String[] args) {
        Human p1 = new Human(30, "Ali", true);

        // 2. Создаем Employee (все данные в коде, не через Scanner)
        Employee w1 = new Employee(25, "Sabok", false, "Manager", 50000);

        // 3. Создаем Student
        Student s1 = new Student(20, "Dana", true, "Media", 3.8f);

        System.out.println("Person: " + p1.getName() + ", " + p1.getAge());
        System.out.println("Employee: " + w1.getJob() + ", " + w1.getMoney());
        System.out.println("Student: " + s1.getStudy() + ", " + s1.getScore());

        w1.setMoney(w1.getMoney() + 10000);
        s1.setScore(s1.getScore() + 0.5f);

        System.out.println("New salary: " + w1.getMoney());
        System.out.println("New score: " + s1.getScore());

        p1.show();
        System.out.println("Type: " + p1.getType());

        w1.show();
        System.out.println("Type: " + w1.getType());

        s1.show();
        System.out.println("Type: " + s1.getType());

        System.out.println("Total employees: " + Employee.count);

    }
}