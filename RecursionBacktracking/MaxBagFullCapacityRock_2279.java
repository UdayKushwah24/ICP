package InfinityChampionsProgram.RecursionBacktracking;

import java.util.Arrays;

public class MaxBagFullCapacityRock_2279 {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
             int n = capacity.length;

        // Calculate remaining capacities
        for(int i = 0; i < n; i++) {
            capacity[i] -= rocks[i];
        }

        // Sort remaining capacities
        Arrays.sort(capacity);

        // Determine maximum number of bags that could have full capacity
        int maxBags = 0;

        for(int i = 0; i < n; i++) {
            if(additionalRocks >= capacity[i]) {
                additionalRocks -= capacity[i];
                maxBags++; 
            }  
        }
        
        return maxBags;
    }
    public static void main(String[] args) {
        int[] capacity = {2,3,4,5};
        int[] rocks = {1,2,4,4};
        int additionalRocks = 2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));

    }
}
