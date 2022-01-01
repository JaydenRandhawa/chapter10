package pt1;

public class Squares {
    public static void main(String[] args) {
        int[] squares= new int[5];

        for(int i=0;i<5;i++){
            squares[i] = (int)Math.pow(i, 2);
        }

        for(int i=0;i<5;i++){
            System.out.println(squares[i]);
        }
;    }
    
}