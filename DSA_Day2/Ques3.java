public class Ques3 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        reverse(0,arr.length-1,arr);
        reverse(0,k-1,arr);
        reverse(k,arr.length-1,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void reverse(int left,int right,int[] arr){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    
}
