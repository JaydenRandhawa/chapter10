package pt1;

import java.util.Random;

public class EvensAndOdds {
    public static void main(String[] args) {
        int nums[] = new int[25];

        Random rand = new Random();

        for(int i=0;i<25;i++){
            nums[i] = rand.nextInt(100);
        }

        String evens = "";
        String odds = "";

        for(int i=0;i<25;i++){
            switch(nums[i]%2){
                case 0: evens += nums[i] + " "; break;
                case 1: odds += nums[i] + " ";
            }
        }

        System.out.println("EVEN: " + evens);
        System.out.println("ODD: " + odds);
        
    }
}