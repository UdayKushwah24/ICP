package InfinityChampionsProgram.Day6;
import java.util.*;
public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(ans, n, k, 1, lst);
        return ans;
    }

    public static void Combination(List<List<Integer>> ans, int n, int k, int idx, List<Integer> lst) {
        if (lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = idx; i <= n; i++) {
            lst.add(i);
            Combination(ans, n, k, i + 1, lst);
            lst.remove(lst.size() - 1);
        }
    }
}