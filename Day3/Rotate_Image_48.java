class Solution {
    public void rotate(int[][] matrix) {
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = i+1; j < matrix.length; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length/2; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][matrix.length-j-1];
        //         matrix[i][matrix.length-j-1] = temp; 
        //     }
        // }
         int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
