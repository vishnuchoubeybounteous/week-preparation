package DSA_Day4;

public class Ques4 {
  

    // Count down: print first, then recurse
    public static void countDown(int n) {
        if (n <= 0) return;

        System.out.print(n + " ");
        countDown(n - 1);   // prints: 5 4 3 2 1
    }

    // Count up: recurse first, then print
    public static void countUp(int n) {
        if (n <= 0) return;

        countUp(n - 1);
        System.out.print(n + " ");   // prints: 1 2 3 4 5
    }

    public static void main(String[] args) {
        countDown(5);
        System.out.println();
        countUp(5);
    }
}

