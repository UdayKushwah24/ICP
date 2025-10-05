package InfinityChampionsProgram.RecursionBacktracking;

public class UniquePath3_980 {

    public static int uniquePathsIII(int[][] grid) {
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    emptyCells++;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        CountPath(grid, startX, startY, 0);
        return totalPath;
    }

    static int totalPath = 0;
    static int emptyCells = 0;
    private static void CountPath(int[][] grid, int i, int j, int countEmptyCell) {
        
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1) {
            return;
        }
        if (grid[i][j] == 2) {
            if (countEmptyCell == emptyCells) {
                totalPath += 1;
            }
            return;
        }

        int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        int temp = grid[i][j];
        grid[i][j] = -1;
        for (int k = 0; k < dir.length; k++) {

            CountPath(grid, i + dir[k][0], j + dir[k][1], countEmptyCell+1);

        }
        grid[i][j] = temp;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
        System.out.println(uniquePathsIII(grid));
    }
}
