import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0&&arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> l=Arrays.asList(arr[i],arr[j],arr[k]);
                    list.add(l);
                    while(j<k&&arr[j]==arr[j+1])j++;
                    while(j<k&&arr[k]==arr[k-1])k--;
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else k--;
            }
        
        }
        System.out.println(list);
    }
}
