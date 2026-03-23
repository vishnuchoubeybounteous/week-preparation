package DSA_Day1;

import java.util.*;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i*i<= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;  
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
