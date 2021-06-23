package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        System.out.println("sdetContractor = " + sdetContractor.calculateSalary(55));
        double annualSDETsalary = sdetContractor.calculateSalary(55);
        System.out.println("annualSDETsalary = " + annualSDETsalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor.toString());


    }
}
