import java.util.Arrays;

public class LargestProductOfThreeInArray {
    public static int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // The largest product can be found either by multiplying the three largest numbers
        // or the two smallest (negative) numbers with the largest number.
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                        nums[0] * nums[1] * nums[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {10, -5, -6, -7};
        System.out.println("The largest product of any three numbers is: " + maximumProduct(nums));
    }
}