public class Ques9 {
    public static void main(String[] args) {
        int[][] mat={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
               int temp=mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length/2;i++){
            for(int j=0;j<mat.length;j++){
                int temp=mat[j][i];
                mat[j][i]=mat[j][mat.length-1-i];
                mat[j][mat.length-1-i]=temp;
            }
        }
        for(int[] arr:mat){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
