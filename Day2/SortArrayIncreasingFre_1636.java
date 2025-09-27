package InfinityChampionsProgram.Day2;


import java.util.*;
public class SortArrayIncreasingFre_1636 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
     
        int ans[] = topKFrequent(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }

    static class Pair {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public static int[] topKFrequent(int[] nums) {
        int ans[] = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.val == p2.val) {
                    return p2.key - p1.key;
                }
                else {
                    return p1.val - p2.val;
                }
                
            }
        });

        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }
        for (int i = 0; i < nums.length; ) {
            Pair p1 = pq.poll();
            int element = p1.key;
            int freq = p1.val;
            while (freq-- > 0) {
                ans[i] = element;
                i++;
            }
        }
        return ans;
    }
}
