package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        double totalMoney = 50;
        double apple = 2.99;
        double milk = 4.49;
        double bread= 1.59;
        double eggs = 6.89;
        double vegetables = 8.11;
        double meat = 25;
        double remaining = totalMoney - (apple + milk +bread + eggs + vegetables +meat);
        System.out.println("I went to supermarket with $" + totalMoney +
                "\nand I spend $" +apple +
                " to apples \nI also bought some milk which is $" + milk +"\nAfter that I had to " +
                "buy some bread and it was $"+ bread+
                "\nalso i need eggs and i payed $"
                +eggs + "\nand also" +
                " i bought vegetables $"
                + vegetables + " also meat cost me  $" + meat + " \nand total was $" + remaining);
        System.out.println();
        System.out.println("totalMoney = " + totalMoney);
        System.out.println("apple = " + apple);
        System.out.println("milk = " + milk);
        System.out.println("bread = " + bread);
        System.out.println("eggs = " + eggs);
        System.out.println("vegetables = " + vegetables);
        System.out.println("meat = " + meat);
        System.out.println("totalPrice = " + remaining);






    }
}
