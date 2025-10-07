package InfinityChampionsProgram.Day8;

public class TargetSum_494 {

    static int count = 0;

    public static int findTargetSumWays(int[] nums, int target) {

        solve(nums, target, 0, 0);
        return count;
    }

    private static void solve(int[] nums, int target, int sum, int i) {

        if (i == nums.length) {
            if (sum == target) {
                count += 1;
            }
            return;
        }

        solve(nums, target, sum + nums[i], i + 1);
        solve(nums, target, sum - nums[i], i + 1);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}
