package InfinityChampionsProgram.Day2;

import java.util.Comparator;
import java.util.PriorityQueue;
 

public class SortCharacterFreq_451 {

    static class Pair {
        int freq;
        char ch;

        public Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public static void main(String[] args) {
        String s = "2a554442f544asfasssffffasss";
        // String s = "Aabb";
        // String s = "cccaaa";
        // String s = "tree";
        int small[] = new int [26];
        int large[] = new int[26];
        int number[] = new int[10];
        
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                large[ascii - 65]++;
            } else if(ascii >= 97 && ascii <= 122) {
                small[ascii - 97]++;
            } else {
                number[ascii - 48]++;
            }
        }


        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2 ) {
                return p2.freq - p1.freq;
            }
        });

        for (int i = 0; i < small.length; i++) {
            if (small[i] > 0) {
                char ch = (char) (97 + i);
                pq.add(new Pair(ch, small[i]));
            }
            if (large[i] > 0) {
                char ch = (char) (65 + i);
                pq.add(new Pair(ch, large[i]));
            }
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                char ch = (char) (48 + i);
                pq.add(new Pair(ch, number[i]));
            }
             
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int f = pq.peek().freq;
            char ch = pq.peek().ch;
            while (f-- > 0) {
                sb.append(ch);
            }
            pq.poll();
        }

        System.out.println(sb.toString());


    }
}
