import models.TransactionController;

public class Main {
    public static void main(String [] args) {
        TransactionController transactionController = new TransactionController();
        transactionController.inputTransactions();
//        System.out.println("hello");
        transactionController.calculateAmounts();
    }
}
