package DSA_Day4;

public class Ques10 {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int pos = binarySearch(arr, 0, arr.length - 1, 7);
        System.out.println("Index is: " + pos);
    }

}
