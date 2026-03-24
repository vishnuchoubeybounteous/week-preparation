import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int largest=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0)sum=0;
            largest=Math.max(largest, sum);
        }
        System.out.println(largest);
    }
    
}
