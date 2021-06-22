package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount dad = new BankAccount();
        dad.user = "dad";
        dad.showBalance();
        dad.spend(100);
        dad.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();
    }
}
