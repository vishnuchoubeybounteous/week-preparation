package DSA_Day4;

public class Ques6 {

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;   // base case: single digit
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of 253: " + sumDigits(253)); // 10
    }

}
