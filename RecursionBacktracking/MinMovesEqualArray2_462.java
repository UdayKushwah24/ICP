package InfinityChampionsProgram.RecursionBacktracking;


import java.util.*;
public class MinMovesEqualArray2_462 {
    public static int minMoves2(int[] nums) {
        long low = Arrays.stream(nums).min().getAsInt();
        long high = Arrays.stream(nums).max().getAsInt();
        long ans = Integer.MAX_VALUE;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long moves1 = isValid(nums, mid);
            long moves2 = isValid(nums, mid + 1);
            ans = Math.min(ans, Math.min(moves1, moves2));
            if (moves1 < moves2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }

    private static long isValid(int[] nums, long mid) {
        long c = 0;
        for (int i = 0; i < nums.length; i++) {
            c += Math.abs(nums[i] - mid);
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(minMoves2(nums));
    }
}