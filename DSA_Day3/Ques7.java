package DSA_Day3;
import java.util.regex.*;
public class Ques7 {
    public static void main(String[] args) {
        String password = "Abc@1234";
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&]).{8,}$";
        System.out.println(password.matches(regex));
    }
}
