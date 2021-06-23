package day45_OOP;

public class TrafficLightObject {
    public static void main(String[] args) {
        //Create traffic light object
        TrafficLight trafficLight  = new TrafficLight();
        //trafficLight.color = "red" NOT THIS WAY today!
        //we will assign/update the value of color using of the class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); DIRECT access to variable. Not recommended
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("yellow");
        trafficLight.showColor();

       trafficLight.changeColor("green");
       trafficLight.showColor();
        System.out.println();







    }
}
