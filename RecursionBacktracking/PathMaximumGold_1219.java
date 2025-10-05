package InfinityChampionsProgram.RecursionBacktracking;

public class PathMaximumGold_1219 {
    public static void main(String[] args) {
        int[][] grid = { { 0, 6, 0 },
                { 5, 8, 7 },
                { 0, 9, 0 } };
         gold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    MaxGold(grid, 0, i, j);
                }
            }
        }
        System.out.println(gold);
    }

    static int gold = 0;

    private static void MaxGold(int[][] grid, int sum, int i, int j) {

        

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            gold = Math.max(sum, gold);
            return;
        }
        int gold = grid[i][j];
        grid[i][j] = 0;
        MaxGold(grid, sum + gold, i, j - 1);
        MaxGold(grid, sum + gold, i, j + 1);
        MaxGold(grid, sum + gold, i - 1, j);
        MaxGold(grid, sum + gold, i + 1, j);
        grid[i][j] = gold;

    }
}
