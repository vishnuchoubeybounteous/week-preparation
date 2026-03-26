public class Ques4 {
    public static void main(String[] args) {
      int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
      int left=0;
      int lmax=0;
      int right=arr.length-1;
      int rmax=arr.length-1;
      int water=0;
      while(left<right){
      if(arr[left]<=arr[right]){
            left++;
            if(arr[left]>=arr[lmax]){
                lmax=left;
            }
            else{
                water+=arr[lmax]-arr[left];
            }
        }
        else{
            right--;
            if(arr[right]>=arr[rmax]){
                rmax=right;
            }
            else{
                water+=arr[rmax]-arr[right];
            }
        }
      } 
           System.out.println(water);
       }
    }
