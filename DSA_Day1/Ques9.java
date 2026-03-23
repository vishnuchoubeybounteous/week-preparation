package DSA_Day1;

import java.util.*;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;        
            reversed = reversed * 10 + digit;
            n = n / 10;           
        }
        System.out.println("Reversed number: " + reversed);
        if (original == reversed) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
