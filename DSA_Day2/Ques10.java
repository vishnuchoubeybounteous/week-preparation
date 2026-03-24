public class Ques10 {
    public static void main(String[] args) {
        int[][] mat1={{1,2,3},{4,5,6},{7,8,9}};
        int m1=mat1.length;
        int n1=mat1[0].length;
        int[][] mat2={{1,2,3},{4,5,6},{7,8,9}};
         int m2=mat2.length;
        int n2=mat2[0].length;
         if(n1 != m2){
        System.out.println("Invalid matrix dimensions");
        return; 
    }
        int[][] mat=new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                    mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int []arr:mat){
            for(int j:arr){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
