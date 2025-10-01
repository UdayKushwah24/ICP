package InfinityChampionsProgram.Day5;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval_435 {
  
    static class Pair {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Start : " + this.start + " End : " + this.end;
        }
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
          Pair[] arr = new Pair[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            arr[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        // Sort by end time
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.end - o2.end;
            }
        });
 
        int activites = 1;
        int endTime = arr[0].end;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start >= endTime) {
                activites++;
                endTime = arr[i].end;
            }
        }
        return (intervals.length - activites);
    
    }
    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        System.out.println(eraseOverlapIntervals(intervals));

    }
}
