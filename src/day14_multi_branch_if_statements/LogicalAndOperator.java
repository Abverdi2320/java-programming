package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true&&true);//true
        System.out.println(true&false);//false
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false

        System.out.println(10 > 5 && 1==1);//true. true+true=true
        System.out.println(11>4 && 3>7); //false. true=false=false
        System.out.println(34>35 && 3>2);//false. false+true=false
        System.out.println(1>2 && 3>4);//false. false+false=false

        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

        if(apples > 6 && oranges > 2){
            System.out.println( "I have enough apples and oranges ");
        }else{
            System.out.println("I need to go to Walmart to buy some fruit");
        }

    }
}
