package InfinityChampionsProgram.Day7;

import java.util.*;

public class NonDecreasingSubSequences_491 {


    public static void findSubsequences(int nums[]) {
        solve(nums, 0, -1, new ArrayList<>());
    }

    private static void solve(int[] nums, int i, int last, List<Integer> ll) {
        if (ll.size() >= 2) {
            System.out.println(ll);
            // Collections.sort(ll);
            return;
        }

        // not pick
         
    }   
    public static void main(String[] args) {
        int[] nums = { 4, 6, 7, };
        findSubsequences(nums);
    }
}
