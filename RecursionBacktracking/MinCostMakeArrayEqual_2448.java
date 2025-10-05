package InfinityChampionsProgram.RecursionBacktracking;

import java.util.Arrays;

public class MinCostMakeArrayEqual_2448 {

    // O(n^2)
    public static long minCost(int[] nums, int[] cost) {
        long ans = Integer.MAX_VALUE;
        for (int i = 0; i < cost.length; i++) {
            long c = 0;

            for (int j = 0; j < cost.length; j++) {
                c += (long) (cost[j] * Math.abs(nums[i] - nums[j]));
                // System.out.println(c);
            }
            System.out.println(c);
            ans = Math.min(ans, c);
        }

        return ans;
    }

    // O[n(log(n))]
    public static long minCost1(int[] nums, int[] cost) {
        long low = Arrays.stream(nums).min().getAsInt();
        long high = Arrays.stream(nums).max().getAsInt();
        long ans = Long.MAX_VALUE;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            long cost1 = findCost(nums, cost, mid);
            long cost2 = findCost(nums, cost, mid + 1);
            ans = Math.min(ans, Math.min(cost1, cost2));
            if (cost1 < cost2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (ans == Long.MAX_VALUE) {
            return 0;
        }
        return ans;
    }

    private static long findCost(int[] nums, int[] cost, long mid) {
        long ans = Long.MAX_VALUE;
        long c = 0L;
        for (int i = 0; i < cost.length; i++) {
            c += (long) (cost[i] * Math.abs(nums[i] - mid));
        }

        ans = Math.min(ans, c);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2 };
        int cost[] = { 2, 3, 1, 14 };
        System.out.println(minCost1(arr, cost));
        // System.out.println(minCost(arr, cost));
    }
}
