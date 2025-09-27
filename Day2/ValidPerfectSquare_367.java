package InfinityChampionsProgram.Day2;

public class ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int n) {
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (Math.pow(mid, 2) <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if (ans * ans == n)
            return true;
        else
            return false;
        // System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(isPerfectSquare(n));
    }
}
