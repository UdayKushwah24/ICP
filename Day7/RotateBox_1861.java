package InfinityChampionsProgram.Day7;

import java.util.Arrays;

public class RotateBox_1861 {


    public static char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] rotateGrid = new char[n][m];
        for (char []grid : rotateGrid) {
            Arrays.fill(grid, '.');
        }
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (boxGrid[i][j] == '#') {
                    count++;
                } else if (boxGrid[i][j] == '*') {
                    rotateGrid[j][m - i - 1] = '*';
                    fill(rotateGrid, count, j - 1, m - i - 1);
                    count = 0;
                }
            }
            if (count > 0) {
                fill(rotateGrid, count,n-1 ,m-i-1);
            }

        }
        return rotateGrid;
    }

    private static void fill(char[][] rotateGrid, int count, int i, int j) {
        while (count-- > 0) {
            rotateGrid[i][j] = '#';
            i--;
            
        }
    }
    public static void main(String[] args) {
        char[][] boxGrid = {{'#','#','*','.','*','.'},
              {'#','#','#','*','.','.'},
                { '#', '#', '#', '.', '#', '.' } };
        char[][] rotateGrid = rotateTheBox(boxGrid);
        for (int i = 0; i < rotateGrid.length; i++) {
            for (int j = 0; j < rotateGrid[0].length; j++) {
                System.out.print(rotateGrid[i][j] + " ");

            }
            System.out.println();
        }
    }
}
