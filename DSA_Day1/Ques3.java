package DSA_Day1;
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(!Character.isLetter(ch)){
            System.out.println("Enter a valid Character");
            return;
        }
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonent");
        }
    }
}
