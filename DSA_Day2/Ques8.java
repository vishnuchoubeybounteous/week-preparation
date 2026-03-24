import java.util.*;
public class Ques8 {
    public static void main(String[] args) {
        int[][] mat={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int left=0;
        int right=mat[0].length-1;
        int up=0;
        int down=mat.length-1;
        List<Integer> list=new ArrayList<>();
        while(left<=right&&up<=down){
            for(int i=left;i<=right;i++){
                list.add(mat[up][i]);
            }
            up++;
            for(int i=up;i<=down;i++){
                list.add(mat[i][right]);
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    list.add(mat[down][i]);
                }
                down--;
            }
            if(up<=down){
                for(int i=down;i>=up;i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
