package models;

import java.util.ArrayList;
import java.util.Scanner;

public class TransactionController {
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    public void inputTransactions() {
        int numberOfLandTransaction;
        int numberOfHouseTransaction;

        System.out.println("Enter number of land transaction: ");
        numberOfLandTransaction = (new Scanner(System.in)).nextInt();
        for(int i = 0; i < numberOfLandTransaction; i++) {
            LandTransaction landTransaction = new LandTransaction();
            landTransaction.input();
            transactions.add(landTransaction);
        }

        System.out.println("Enter number of house transaction: ");
        numberOfHouseTransaction = (new Scanner(System.in)).nextInt();
        for(int i = 0; i < numberOfHouseTransaction; i++) {
            HouseTransaction houseTransaction = new HouseTransaction();
            houseTransaction.input();
            transactions.add(houseTransaction);
        }
    }
    public void calculateAmounts() {
        int numberOfHouseTransactions = 0;
        int numberOfLandTransactions = 0;
        int numberOfTypeA = 0;
        int numberOfTypeB = 0;
        int numberOfTypeC = 0;
        int numberOfVip = 0;
        int numberOfNormal = 0;
        for(Transaction transaction: transactions) {
            if (transaction instanceof HouseTransaction) {
                numberOfHouseTransactions++;
                if (((HouseTransaction) transaction).getHouseType() == HouseType.NORMAL) {
                    numberOfNormal++;
                } else if (((HouseTransaction) transaction).getHouseType() == HouseType.VIP) {
                    numberOfVip++;
                }

            } else if (transaction instanceof LandTransaction) {
                numberOfLandTransactions++;
                if (((LandTransaction) transaction).getLandType() == LandType.A) {
                    numberOfTypeA++;
                } else if (((LandTransaction) transaction).getLandType() == LandType.B) {
                    numberOfTypeB++;
                } else if (((LandTransaction) transaction).getLandType() == LandType.C) {
                    numberOfTypeC++;
                }
            }
        }
        System.out.println("number of land type A: " + numberOfTypeA);
        System.out.println("number of land type B: " + numberOfTypeB);
        System.out.println("number of land type C: " + numberOfTypeC);
        System.out.println("number of house type vip: " + numberOfVip);
        System.out.println("number of house type normal: " + numberOfNormal);
    }
}
