public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int maxwater = 0;
        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left]>=leftMax) {
                    leftMax=arr[left];
                } else {
                    maxwater+=(leftMax - arr[left]);
                }
                left++;
            } else {
                if (arr[right]>=rightMax) {
                    rightMax=arr[right];
                } else {
                    maxwater+=(rightMax-arr[right]);
                }
                right--;
            }
        }
        System.out.println(maxwater);
    }
}