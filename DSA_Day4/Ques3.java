package DSA_Day4;

public class Ques3 {
    public static void modifyPrimitive(int x) {
        x = 99;
        System.out.println("Inside modifyPrimitive: x = " + x);
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 99;
        System.out.println("Inside modifyArray: arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int a = 10;
        int[] b = {10, 20};

        System.out.println("Before calls:");
        System.out.println("a = " + a);
        System.out.println("b[0] = " + b[0]);

        modifyPrimitive(a);
        modifyArray(b);    

        System.out.println("After calls:");
        System.out.println("a = " + a);       
        System.out.println("b[0] = " + b[0]); 
    }
}
