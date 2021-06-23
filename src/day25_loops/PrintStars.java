package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

        for(int stars = 0; stars <5; stars++){
        //    System.out.print("\uD83C\uDF1F");
        }


        String myStars ="";
        for(int starss = 0; starss < 5; starss++){
            myStars+="\uD83C\uDF1F ";
            System.out.print (myStars);
        }


    }
}
