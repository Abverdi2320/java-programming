package Practice;

public class ConstructorReviewObject {
    public static void main(String[] args) {
        ConstructorReview any = new ConstructorReview();
        any.setName("Emin");
        any.setAge(35);
        any.setEyeColor("Black");
        any.setHairColor("Pink");
        System.out.println(any);

        System.out.println();

        ConstructorReview Pervin = new ConstructorReview();
        Pervin.setName("Periw");
        Pervin.setAge(27);
        Pervin.setHairColor("Orange");
        Pervin.setEyeColor("White");
        System.out.println(Pervin);
        System.out.println();

        ConstructorReview eliw = new ConstructorReview();
        System.out.println(eliw);

        System.out.println();

        ConstructorReview Ab = new ConstructorReview("Abbas","Black","Red",24);
        System.out.println(Ab);
        System.out.println();
        System.out.println(any);


    }
}
