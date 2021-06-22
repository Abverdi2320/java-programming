package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountHolder("Abbas Verdiyev");
        System.out.println(account.getAccountHolder());
        account.setAccountNumber(1234565432);
        System.out.println(account.getAccountNumber());
        account.setBalance(153000);
        System.out.println(account.getBalance());
        account.setType("Checking");
        System.out.println(account.getType());
        System.out.println(account);
    }
}
