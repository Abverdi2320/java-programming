package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file? ");
        char selection = 'Y';
        boolean answer;
        if (selection == 'Y') {
            System.out.println("Your file will be deleted");
            answer = true;
        } else {
            System.out.println("File deletion cancelled");
            answer = false;
        }

        System.out.println("Did file get deleted? - " + answer);
    }
}
