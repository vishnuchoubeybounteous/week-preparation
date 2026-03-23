package DSA_Day1;
import java.util.*;
public class Ques5 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number: "); 
       int n=sc.nextInt();
       if (n < 0) {
        System.out.println("Factorial not defined for negative numbers");
        return;
        }
        else if (n > 20) {
        System.out.println("Result too large (overflow)");
        return;
        }
        int temp=n;
        long ans=1;
        while(temp>1){
            ans*=temp;
            temp--;
        }
        System.out.println("Factorial of "+n+" is:"+ ans);
    }
}
