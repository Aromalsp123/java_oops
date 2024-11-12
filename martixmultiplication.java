package matrix;
import java.util.*;
public class matrix {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the matrix1 row: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the size of the matrix1 column: ");
        int c1 = sc.nextInt();
        System.out.println("Enter the size of the matrix1 row: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the size of the matrix1 column: ");
        int c2 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][r2];
        int[][] resultmatrix =new int[r1][c2];

       System.out.println("Enter the elements on the matrix1: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                    matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements on the matrix2: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                    matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                resultmatrix[i][j] =0;
                for(int k =0;k<c1;k++)
                    resultmatrix[i][j] += matrix1[i][k]*matrix2[k][j];
            }
        }

        System.out.println("Enter the elements on the matrix maltip: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                  System.out.print(resultmatrix[i][j]+" ");
            }System.out.println();2
            
        }
     sc.close();
    }
    
}
