package InfinityChampionsProgram.RecursionBacktracking;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 2 }, cost = { 2, 3, 1, 14 };
        long low = Arrays.stream(nums).min().getAsInt();
        long high = Arrays.stream(nums).max().getAsInt();
        long ans = Long.MAX_VALUE;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long cost1 = findCost(nums, cost, mid);
            long cost2 = findCost(nums, cost, mid + 1);
            ans = Math.min(cost1, cost2);
            if (cost1 < cost2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

    }

   
}
