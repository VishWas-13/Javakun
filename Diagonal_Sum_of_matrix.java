import java.util.*;
public class Sum_of_diagonals_of_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,row,col,sum=0, sum1=0;
        System.out.println("Enter number of rows: ");
        row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        col = sc.nextInt();
        int [][]matrix = new int [row][col];
        System.out.println("Enter the elements of the matrix:");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Elements of matrix are: ");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (i==j){
                    sum=sum+matrix[i][j];
                }
                if (i+j ==(row-1)){
                    sum1 = sum1+matrix[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal elements of Matrix is: "+sum);
        System.out.println("Sum of left diagonal elements of Matrix is: "+sum1);
    }
}
