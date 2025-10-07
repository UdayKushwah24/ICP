package InfinityChampionsProgram.Day8;

public class CanPlaceFlowers_605 {
    
    
    public static boolean canPlaceFlowers(int[] arr, int x) {
        int n = arr.length;
        if (x == 0) {
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                boolean left = i == 0 ? true : arr[i - 1] == 0;
                boolean right = i == n - 1 ? true : arr[i + 1] == 0;
                if (left && right) {
                    arr[i] = 1;
                    x--;
                    if (x == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    
    
    public static void main(String[] args) {
        int flowerbed[] = {1,0,0,0,1};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
