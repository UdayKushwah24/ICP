package InfinityChampionsProgram.RecursionBacktracking;

import java.util.Arrays;

public class NumberFlowersFullBloom_2251 {
    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        for (int i = 0; i < end.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        int ans[] = new int[people.length];
        for (int i = 0; i < ans.length; i++) {
            int time = people[i];
            int flowerbloom = BloomFlower(start, time);
            int uskeAaneSePahle = MurjaayeFuul(end, time);
            
            System.out.println(flowerbloom + " " + uskeAaneSePahle);
            ans[i] = flowerbloom - uskeAaneSePahle;
        }
        return ans;
    }

    private static int MurjaayeFuul(int[] end, int time) {
        int idx = 0;
        int i = 0;
        int j = end.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (end[mid] < time) {
                idx = mid+1;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return idx;
    }

    private static int BloomFlower(int[] start, int time) {
        int idx = 0;
        int i = 0;
        int j = start.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (start[mid] <= time) {
                idx = mid+1;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[][] flowers = { { 1, 10 }, { 3, 3 } };
        int[] people = { 3,3,2};
        // int[][] flowers = { { 1, 6 }, { 3, 7 }, { 9, 12 }, { 4, 13 } };
        // int[] people = { 2, 3, 7, 11 };
        int ans[] = fullBloomFlowers(flowers, people);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
