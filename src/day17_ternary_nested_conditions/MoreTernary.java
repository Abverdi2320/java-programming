package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String status = (hourlyRate > 45) ? "Accept" : "Reject";
        System.out.println("status = " + status);


        String todaysClass = "Java";
        String teacher = (todaysClass.equals("Java")) ? "Saim/Murodil " : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "Have DL can drive " : "NO DL cannot drive";
        System.out.println("driving = " + driving);
    }
}