import models.Account;

public class Main {
    public static void main(String [] args) {
        Account account = new Account(888888L, "Mac Van B");
        System.out.println(account.toString());
        account.withdraw(20.0f);
        System.out.println(account.toString());
        account.deposit(10.0f);
        System.out.println(account.toString());
    }
}
