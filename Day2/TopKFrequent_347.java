package InfinityChampionsProgram.Day2;
 
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent_347 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k = 2;
        int ans[] = topKFrequent(arr, k);
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

    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
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
                return p2.val - p1.val;
            }
        });

        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().key;
        }
        return ans;
    }
}
