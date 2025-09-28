package DailyLeetcodeQuestion;

import java.util.Arrays;

public class KthSmallestNum_668 {
    public static int findKthNumber(int m, int n, int k) {
        int arr[] = new int[m * n];
        int x = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[x++] = i * j;
            }
        }
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr[k-1];
    }
    public static void main(String[] args) {
        // int m = 3, n = 3, k = 5;
        int m = 2, n = 3, k = 6;
        System.out.println(findKthNumber(m, n, k));
    }
}
