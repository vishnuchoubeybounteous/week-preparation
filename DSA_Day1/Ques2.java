package DSA_Day1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int percent=sc.nextInt();
        if(percent>=90&&percent<=100){
            System.out.println("He got grade A");
        }
        else if(percent>=80&&percent<90){
            System.out.println("He got grade B");
        }
        else if(percent>=70&&percent<80){
            System.out.println("He got grade C");
        }
        else if(percent>=60&&percent<70){
            System.out.println("He got grade D");
        }
        else if(percent>=0&&percent<60){
            System.out.println("He got grade F");
        }
        else{
            System.out.println("It is not a valid percentage");
        }

    }
}
