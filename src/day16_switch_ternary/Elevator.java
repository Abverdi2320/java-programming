package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected.");
            System.out.println("Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected.");
            System.out.println("Companies: Cybertek, Nasa, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected");
            System.out.println("Companies: Lyft, Bofa , Stake House");
        } else {
            System.out.println("Invalid Floor " + floorNum);
        }

        System.out.println("===========SWITCH STATEMENT VERSION===========");

        floorNum = 1;
        switch (floorNum) {
            case 1://SAME AS IF (floorNum == 1)
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; // IT MEANS EXIT SWITCH STATEMENT
            case 2:
                System.out.println("Floor 2 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            default:
                System.out.println("Invalid floor " + floorNum);
        }
    }
}
