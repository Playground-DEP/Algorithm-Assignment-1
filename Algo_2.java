import java.util.Scanner;

public class Algo_2 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
        int max = 0;
        int min = nums[1];

        for(int i = 0; i<nums.length; i++){
            if (nums[i] > max) max = nums[i];
            if (nums [i] < min) min = nums[i];
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
    
}
