public class Ques7 {
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        int k = 3;
        int sum=0;
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           if(i-left+1>k){
            sum-=arr[left];
            left++;
           }
           if(i-left+1==k)
           max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
