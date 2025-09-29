package InfinityChampionsProgram.DailyLeetcodeQuestion;

import java.util.Arrays;

public class MaximumCandiesAllocated_2226 {


    public static int maximumCandies(int[] candies, long k) {
        
        int l = 1;
         
        int h = Arrays.stream(candies).max().getAsInt();
       
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isPossible(candies, mid, k)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] candies, int mid, long k) {
        int c = 0;
        for (int candi : candies) {
            c += candi / mid;
            // if (candi >= mid) {
            //     c++;
            // }
            if (c >= k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int candies[] = { 4, 7, 5};
        int k = 4;
        // int candies[] = { 8,7,5,3,5,7};
        // int k = 6;
        // int candies[] = { 8,7,5,3,5,7};
        // int k = 3;
        // int candies[] = { 5, 8, 6 };
        // int k = 3;
        System.out.println(maximumCandies(candies, k));
    }
}
