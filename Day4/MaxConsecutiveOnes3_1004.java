package InfinityChampionsProgram.Day4;

public class MaxConsecutiveOnes3_1004 {


    public static int longestOnes(int[] nums, int k) {
        int si = 0, ei = 0, len = 0, flip = 0;
        while (ei < nums.length) {

            // grow
            if (nums[ei] == 0) {
                flip++;
            }

            // shrink
            while (si <= ei && flip > k) {
                if (nums[si] == 0) {
                    flip--;
                }
                si++;
            }

            len = Math.max(len, ei - si + 1);
            ei++;
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
}
