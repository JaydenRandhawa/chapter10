package pt2;

import java.util.Scanner;

public class TravellingSalesman {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pos[] = new int[2];

        pos[0] = inp.nextInt();
        pos[1] = inp.nextInt();

        int cityCount = inp.nextInt();

        int cities[][] = new int[2][cityCount];
        int values[] = new int[cityCount];

        int profit = 0;

        for(int i=0;i<cityCount;i++){
            cities[0][i] = inp.nextInt();
            cities[1][i] = inp.nextInt();
            values[i] = inp.nextInt();
        }
        int moveCount = inp.nextInt();

        for(int i=0;i<moveCount;i++){
            switch(inp.next().charAt(0)){
                case 'U': pos[1] -= 1; break;
                case 'D': pos[1] += 1; break;
                case 'L': pos[0] -= 1; break;
                case 'R': pos[0] += 1; break;
            }
            for(int ii=0;ii<cityCount;ii++){
                if(pos[0] == cities[0][ii] && pos[1] == cities[1][ii]){
                    profit += values[ii];
                    break;
                }
            }
        }

        System.out.println(profit);

        inp.close();
    }
}