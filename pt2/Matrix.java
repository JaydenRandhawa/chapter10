package pt2;

import java.util.Scanner;

public class Matrix {
    
    public static Scanner in = new Scanner(System.in);
    public static int row, col, i, j;
    public static int matrix1[][] = new int[3][3];
    public static int matrix2[][] = new int[row][col];
    public static int resultMatrix[][] = new int[row][col];
    
    public static void main(String args[]) {
        getMatrix();
        addMatrices();
        showMatrix();
        }
    
    static void getMatrix() {
 
        System.out.print("Enter the number of rows: ");
        row = in.nextInt();
 
        System.out.print("Enter the number columns: ");
        col = in.nextInt();
 
 
        System.out.print("\nEnter the elements of Matrix 1: ");
 
        for (i = 0 ; i < row ; i++) { 
            for ( j = 0 ; j < col ; j++) {
                matrix1[i][j] = in.nextInt();
                System.out.println();
            }
        }
        
        System.out.println("Enter the elements of Matrix 2");
 
        for ( i= 0 ; i < row ; i++ ) {
 
            for ( j= 0 ; j < col ;j++ )
                matrix2[i][j] = in.nextInt();
 
                System.out.println();
            }
    }
    
    static void addMatrices() {
        for (i= 0 ; i < row ; i++)
            for ( j= 0 ; j < col ;j++ )
            resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j] ; 
    }
    
    static void showMatrix() {
 
            System.out.println("Sum of matrices:-");
 
            for (i= 0 ; i < row ; i++) { 
                for ( j= 0 ; j < col ; j++ )
                System.out.print(resultMatrix[i][j]+"\t");
                System.out.println();
                }
        
    }

}