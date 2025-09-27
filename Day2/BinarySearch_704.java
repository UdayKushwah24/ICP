package InfinityChampionsProgram.Day2;

public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       int target = 9;
       System.out.println(search(nums, target));
    }
}
