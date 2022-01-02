package pt2;

import java.util.Scanner;

public class AddingMatrices {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a width: ");
        int width = inp.nextInt();
        System.out.print("Please enter a height: ");
        int height = inp.nextInt();

        System.out.println("Matrix 1:");
        int[][] matrix1 = getMatrix(width, height);
        System.out.println("Matrix 2:");
        int[][] matrix2 = getMatrix(width, height);

        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        showMatrix(matrix1);
        showMatrix(matrix2);
        showMatrix(resultMatrix);

        inp.close();
    }

    public static int[][] getMatrix(int width, int height){
        Scanner inp = new Scanner(System.in);

        int[][] matrix = new int[width][height];

        for(int i=0;i<height;i++){
            for(int ii=0;ii<width;ii++){
                System.out.print("Please enter position " + i + ", " + ii + ": ");
                matrix[i][ii] = inp.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        int width = matrix1.length;
        int height = matrix1[0].length;
        int[][] resultMatrix = new int[width][height];
        
        for(int i=0;i<width;i++){
            for(int ii=0;ii<height;ii++){
                resultMatrix[i][ii] = matrix1[i][ii] + matrix2[i][ii];
            }
        }

        return resultMatrix;
    }

    public static void showMatrix(int[][] matrix){
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            for(int ii=0;ii<matrix[0].length;ii++){
                System.out.print(matrix[i][ii] + " ");
            }
            System.out.println();
        }
    }
}