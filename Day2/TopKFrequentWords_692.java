package InfinityChampionsProgram.Day2;


import java.util.*;
public class TopKFrequentWords_692 {
    public static void main(String[] args) {
        String[] arr = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 2;
        System.out.println(topKFrequent(arr, k));
    }

    static class Pair {
        String key;
        int freq;

        public Pair(String key, int freq) {
            this.key = key;
            this.freq = freq;
        }
    }

    public static List<String> topKFrequent(String[] nums, int k) {
      
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
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
                if (p1.freq == p2.freq) {
                    // Lexicographical order if freq same
                    return p1.key.compareTo(p2.key);
                }
                // Higher freq first
                return p2.freq - p1.freq;
            }
        });

        for (String key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }

        List<String> ll = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ll.add(0,pq.poll().key);
        }
        return ll;
    }
}
