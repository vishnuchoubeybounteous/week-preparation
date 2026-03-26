package DSA_Day4;

public class Ques5 {


    public static void infiniteRecursion(int count) {
        System.out.println("Count: " + count);
        infiniteRecursion(count + 1);   // no base case → StackOverflowError
    }

    public static void main(String[] args) {
        infiniteRecursion(0);
    }

}
