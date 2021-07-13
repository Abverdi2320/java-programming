package OfficeHours.Practice_07_12_2021;

public class PC extends PB implements PI{
    int num;
    String name;

    @Override
    public void go(){
        System.out.println("PC GO ");
    }

    @Override
    public void math() {
        System.out.println("Doing Math");

    }
}
