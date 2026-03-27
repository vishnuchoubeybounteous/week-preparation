package DSA_Day4;

public class Ques9 {
    public static long power(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        long half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
    }
}
