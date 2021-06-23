package OfficeHours.Practice_05_17_2021;

public class rectangleObjects {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.getArea());
        rec.setDimensions(5,3);
        System.out.println(rec.getArea());
        System.out.println(rec);

        Rectangle rec2 = new Rectangle();
        System.out.println(rec2.getArea());

    }
}
