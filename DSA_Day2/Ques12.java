import java.util.*;

public class Ques12 {
    public static void main(String[] args) {

        int[][] board = {{0,1,0},
                        {0,1,0},
                         {0,1,0}};
        int m = board.length;
        int n = board[0].length;
        int[][] result = new int[m][n];
        int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int count = 0;
                for(int[] arr : dirs) {
                    int row = i+arr[0];
                    int col = j+arr[1];
                    if(row>=0 &&row<m&&col>=0&&col<n&&board[row][col]==1) {
                        count++;
                    }
                }
                if(board[i][j] == 1) {
                    if(count<2)result[i][j]=0; 
                    else if(count == 2 || count == 3) result[i][j] = 1;
                    else result[i][j] = 0;
                } else {
                    if(count == 3)result[i][j] =1;
                    else result[i][j] = 0;
                }
            }
        }
        for(int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}