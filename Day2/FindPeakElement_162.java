package InfinityChampionsProgram.Day2;

public class FindPeakElement_162 {
    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[0] > nums[1])
                return 0;
            if (i == nums.length - 1 && nums[i - 1] < nums[i])
                return nums.length - 1;
            if (nums[i] > nums[i + 1] && nums[i - 1] < nums[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
