package InfinityChampionsProgram.Day6;

public class CombinationsSum2_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(ans, candidates, target, 0, lst);
        return ans;
    }

    public static void Combination(List<List<Integer>> ans, int[] coin, int amount, int idx, List<Integer> lst) {
        if (amount == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (i > idx && coin[i] == coin[i - 1])
                continue;
            if (amount >= coin[i]) {
                lst.add(coin[i]);
                Combination(ans, coin, amount - coin[i], i + 1, lst);
                lst.remove(lst.size() - 1);
            }
        }
    }
}