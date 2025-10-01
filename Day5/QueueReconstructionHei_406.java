package InfinityChampionsProgram.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class QueueReconstructionHei_406 {

    public static int[][] reconstructQueue(int[][] people) {
        /*
         * Arrays.sort(people, new Comparator<int[]>() {
         * 
         * @Override
         * public int compare(int[] a, int b[]) {
         * if (b[0] > a[0]) {
         * return b[0] - a[0];
         * } else if (a[0] == b[0]) {
         * return a[1] - b[1];
         * }
         * return 0;
         * }
         * });
         */

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int b[]) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }

        return res.toArray(new int[people.length][2]);
    }

    public static void main(String[] args) {
        int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        int ans[][] = reconstructQueue(people);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
