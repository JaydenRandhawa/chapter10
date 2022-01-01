package pt1;

public class GeneratedNums {
    public static void main(String[] args) {

        int[] nums = new int[101];

        System.out.printf("%-10s%s\n", "Index", "Generated Number");

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int x = i;

            while (x > 0) {
                sum = sum + x % 10;
                x = x / 10;
            }

            nums[i] = sum + i;

            System.out.printf("%-10d%d\n", i, nums[i]);
        }
    }
}
