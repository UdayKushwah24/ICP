package InfinityChampionsProgram.Day2;


import java.util.*;
public class MostFrequentEvenEl_2404 {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 9, 2, 4 };
        // int[] arr = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        
        
        System.out.println(topKFrequent(arr));
    }

    static class Pair {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public static int topKFrequent(int[] nums ) {
   
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        System.out.println(map);
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.val == p2.val) {
                    return p1.key - p2.key;
                } else {

                    return p2.val - p1.val;
                }
            }
        });


        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }
        // while (!pq.isEmpty()) {
            
        
        //     Pair p1 = pq.poll();
        //     System.out.println(p1.key + " " + p1.val);
             

        // }
        int ans = -1;
        while (!pq.isEmpty()) {
            Pair p1 = pq.poll();
            if (p1.key % 2 == 0) {
                ans = p1.key;
                break;
            }
            

        }
        return ans;
    }
}
