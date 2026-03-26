import java.util.*;

public class Ques11 {
    public static void main(String[] args) {
        char[][] board = {{'E','M','E'},{'E','M','M'},{'E','M','E'}};
        int m = board.length;
        int n = board[0].length;
        int[][] dirs ={{-1,-1}, {-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i = 0; i < m; i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]=='M') continue;
                int count = 0;
                for(int[] d : dirs) {
                    int row=i+d[0];
                    int col=j+d[1];
                    if(row>=0 &&row<m &&col >= 0&&col<n&&board[row][col] == 'M'){
                        count++;
                    }
                }
                board[i][j]=(char)(count+'0');
            }
        }
        for(char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}