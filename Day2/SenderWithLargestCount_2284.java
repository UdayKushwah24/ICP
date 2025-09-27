package InfinityChampionsProgram.Day2;



import java.util.*;
public class SenderWithLargestCount_2284 {
    public static void main(String[] args) {
        String[] messages = { "How is leetcode for everyone", "Leetcode is useful for practice" };
        String[] senders = { "Bob", "Charlie"  };
        // String[] messages = { "Hello userTwooo", "Hi userThree", "Wonderful day Alice", "Nice day userThree" };
        // String[] senders = { "Alice", "userTwo", "userThree", "Alice" };
        System.out.println(largestWordCount(messages, senders));

    }


    static class pair {
        String sender;
        int totalwords;

        public pair(String sender, int totalwords) {
            this.sender = sender;
            this.totalwords = totalwords;
        }
    }

    public static String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < senders.length; i++) {
            String[] m = messages[i].split(" ");
            if (!map.containsKey(senders[i])) {
                map.put(senders[i], m.length);
            } else {
                map.put(senders[i], map.get(senders[i]) + m.length);
            }
        }
        System.out.println(map);
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {
            @Override
            public int compare(pair p1, pair p2) {
                if (p1.totalwords == p2.totalwords) {
                    return p2.sender.compareTo(p1.sender);
                }
                return p2.totalwords - p1.totalwords;
            }
        });

        for (String s : map.keySet()) {
            pq.add(new pair(s, map.get(s)));
        }

        return pq.poll().sender;
    }
     
}
