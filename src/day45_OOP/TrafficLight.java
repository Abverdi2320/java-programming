package day45_OOP;

public class TrafficLight {
    String color;

    // This is read only method, displays value of color variable
    public void showColor (){
        System.out.println("Current color = " + color);

    }
    public void changeColor(String newColor){
        if (newColor.equalsIgnoreCase("red")|| newColor.equalsIgnoreCase("yellow")||newColor.equalsIgnoreCase("green")){
            System.out.println("Changing color to = " +newColor);
            color = newColor;
        }else{
            System.out.println("ERROR: Invalid color:");

        }




    }
}
