package InfinityChampionsProgram.Day8;


import java.util.*;

public class NonDecreasingSubsequences_491 {
    
    static HashSet<List<Integer>> set = new HashSet<>();
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> ll = new ArrayList<>();
     
        helper(nums, ll, 0);
        List<List<Integer>> list = new ArrayList<>();
        for (List<Integer> item : set) {
            list.add(item);
        }
        return list;
    }


    private static void helper(int[] nums, List<Integer> ll, int i) {
        if (i == nums.length) {
            if (ll.size() >= 2) {
                set.add(new ArrayList<>(ll));
            }
            return;
        }

        // not pick
        helper(nums, ll, i + 1);
        
        // pick
        if (ll.size() == 0 || ll.get(ll.size()-1) <= nums[i]) {
            ll.add(nums[i]);
            helper(nums, ll, i + 1);
            ll.remove(ll.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = { 4, 6, 7, 7 };
        System.out.println(findSubsequences(nums));
    }
}