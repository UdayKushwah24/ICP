package InfinityChampionsProgram.RecursionBacktracking;

public class SpecialPosMatrix_1582 {
    public static int numSpecial(int[][] mat) {
        int ans = 0;
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];

        for (int i = 0; i < row.length; i++) {
            int c = 0;
            for (int j = 0; j < col.length; j++) {
                if (mat[i][j] == 1) {
                    c++;
                }
            }
            row[i] = c;
        }
        for (int j = 0; j < col.length; j++) {
            int c = 0;
            for (int i = 0; i < row.length; i++) {
                if (mat[i][j] == 1) {
                    c++;
                }
            }
            col[j] = c;
        }

        for (int i = 0; i < col.length; i++) {
            System.out.print(col[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    ans++;
                }
            }
        }
        System.out.println();
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 1, 0, 0 } };
        // int[][] mat = {
        //         { 1, 0, 0 },
        //         { 0, 0, 1 },
        //         { 1, 0, 0 }  };
        System.out.println();
        System.out.println(numSpecial(mat));
    }
}
