package InfinityChampionsProgram.Day2;

public class MedianTwoSortedArray_4 {
    public static void main(String[] args) {
        int nums1[] = { 1, 2 }, nums2[] = { 3, 4 };
        int[] mergedArr = MergeSorted(nums1, nums2);
    }

    private static int[] MergeSorted(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sortArray[] = new int[m + n];
        int i = 0, j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                sortArray[k] = nums1[i];
                i++;
                k++;
            } else {
                sortArray[k] = nums2[i];
                j++;
                k++;
            }
        }
        
    }

 
    
}
