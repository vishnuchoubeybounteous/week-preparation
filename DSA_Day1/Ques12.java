package DSA_Day1;

import java.util.*;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully");
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
