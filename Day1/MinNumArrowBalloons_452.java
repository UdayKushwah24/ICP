package InfinityChampionsProgram.Day1;

import java.util.Arrays;

 

public class MinNumArrowBalloons_452 {

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                System.out.print(points[i][j] + " ");
            }
            System.out.println();
        }

        int psp = points[0][0];   // previous starting point
        int pep = points[0][1]; // previous ending point
        int arrow = 1;
        for (int i = 1; i < points.length; i++) {
            int csp = points[i][0];
            int cep = points[i][1];
            if (csp > pep) {  // no-overlap
                arrow++;
                psp = csp;
                pep = cep;
            } else {  // overlap
                psp = Math.max(psp, csp);
                pep = Math.min(pep, cep);
            }

        }
        return arrow;
    }
    public static void main(String[] args) {
        int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        System.out.println(findMinArrowShots(points));
    }
}
