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

        inp.close();
        return matrix;
    }
}