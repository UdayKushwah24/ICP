package InfinityChampionsProgram.Day7;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List; 

public class ThreeSum_15 {
    
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++) {
            int f = nums[i];
            int si = i + 1;
            int ei = nums.length - 1;
            while (si <= ei) {
                if (nums[si] + nums[ei] + f == 0) {
                    ArrayList<Integer> ll = new ArrayList<>();
                    ll.add(f);
                    ll.add(nums[si]);
                    ll.add(nums[ei]);
                    list.add(ll);
                } else if (nums[si] + nums[ei] + f < 0) {
                    si++;
                } else {
                    ei--;
                }
            }
        }
        return list;
    }
    
    
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));

    }
}
