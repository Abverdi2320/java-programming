package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length() == 0);
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, can you please resend");
        } else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("jobtitle is empty");
        } else {
            System.out.println("job title is not empty");
        }

         String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()){
            System.out.println("we have " +veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty()); // not initialized ERROR!!!



    }
}



