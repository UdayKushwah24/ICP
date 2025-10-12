package InfinityChampionsProgram.RecursionBacktracking;

import java.util.*;

 
public class Permutation_46 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> list = new ArrayList<>();
        Permutation(list, arr, new ArrayList<>());
        System.out.println(list);

    }

    private static void Permutation(List<List<Integer>> list, int[] arr, List<Integer> ll) {
        if (arr.length == 0) {
            list.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int ch = arr[i];
            int rem[] = new int[arr.length - 1];
            for (int j = 0; j < i; j++) {
                rem[j] = arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rem[j - 1] = arr[j];
            }
            ll.add(ch);
            Permutation(list, rem, ll);
            ll.remove(ll.size() - 1);
        }
    }
 

    
}
