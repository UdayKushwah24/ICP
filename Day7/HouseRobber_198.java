package InfinityChampionsProgram.Day7;

import java.util.Arrays;

public class HouseRobber_198 {
    
   public static int RobberBU(int[] nums) {
        if (nums.length == 1)  {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < dp.length; i++) {
            int rob = nums[i] + dp[i - 2];
            int not_rob = dp[i - 1];
            dp[i] = Math.max(rob, not_rob);
        }
        return dp[nums.length-1];
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);

        return RobberBU(nums);
    }

}
