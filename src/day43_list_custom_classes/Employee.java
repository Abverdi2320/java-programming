package day43_list_custom_classes;

public class Employee {
    String name;
    int age;
    String jobTitle;

    public void work() {
        System.out.println("Eflatun works in Bestbuy");
    }
}
    class guy {
        public static void main(String[] args) {
            Employee employee1 = new Employee();
            employee1.name = "Eflatun";
            employee1.age = 38;
            employee1.jobTitle = "Store Manager";
            employee1.work();

            System.out.println("Name = " + employee1.name);
            System.out.println("Age =  " + employee1.age);
            System.out.println("Job Title = " + employee1.jobTitle);

            System.out.println();

            Employee employee2 = new Employee();
            employee2.name = "Elvin";
            employee2.age = 31;
            employee2.jobTitle = "Amazon";
            employee2.work();

            System.out.println("Name = " + employee2.name);
            System.out.println("Age =  " + employee2.age);
            System.out.println("Job Title = " + employee2.jobTitle);

        }
    }



