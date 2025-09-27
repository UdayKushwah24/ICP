package InfinityChampionsProgram.Day2;

import java.util.Arrays;

public class MaxProductThreeNum_628 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums); // Sort array
        int n = nums.length;
        int posPro = nums[n - 3] * nums[n - 2] * nums[n - 1];
        int negPro = nums[0] * nums[1] * nums[n - 1];
        return Math.max(posPro, negPro);
    }

    public static void main(String[] args) {
        
    }
}

