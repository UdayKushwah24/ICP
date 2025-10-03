package InfinityChampionsProgram.Day7;

import java.util.HashSet;

public class MaxSumDistinctSubArr_2461 {

    public static long maximumSubarraySum(int[] arr, int k) {
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();
        long ans = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            while (set.contains(arr[j])) {
                sum -= arr[i];
                set.remove(arr[i]);
                i++;
            } 
            sum += arr[j];
            set.add(arr[j]);
            if (j - i + 1 == k) {
                ans = Math.max(sum, ans);
                sum -= arr[i];
                set.remove(arr[i]);
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 9, 9 };
        // int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }

}
