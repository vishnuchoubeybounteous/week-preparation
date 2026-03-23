package DSA_Day1;
import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String secret="vishnu6701";
        String s=null;
        do{  
            if(s==null)
            System.out.println("Enter the secret: ");
            else
            System.out.println("Wrong secret, Enter again: ");
             
            s=sc.next();
        }
        while(!s.equals(secret));
        System.out.println("Access Granted");
    }
}
