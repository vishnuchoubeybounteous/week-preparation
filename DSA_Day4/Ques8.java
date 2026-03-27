package DSA_Day4;

public class Ques8 {
    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("Fib(" + n + ") = " + fib(n));
    }

}
