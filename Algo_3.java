import java.util.Scanner;

public class Algo_3 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
    int[] nums1 = new int[nums.length];

    for (int i = 1; i < nums1.length+1; i++) {
        nums1[i-1] = nums[nums.length-i];
    }

    nums = nums1;

    
        System.out.print("[");
    for (int i = 0; i < nums1.length; i++) {
        System.out.print(nums[i] + ", ");
    }
    System.out.print("\b\b]");
    }
    
}
