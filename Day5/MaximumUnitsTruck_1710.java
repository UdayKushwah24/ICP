package InfinityChampionsProgram.Day5;

import java.util.Arrays;
 

public class MaximumUnitsTruck_1710 {
    
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);


        for (int i = 0; i < boxTypes.length; i++) {
            System.out.println(boxTypes[i][0] + " -> "+ boxTypes[i][1]);
        }
        int ans = 0;
       
        for (int i = 0; i < boxTypes.length; i++) {
            int type = boxTypes[i][0];
            int size = boxTypes[i][1];
            if (type < truckSize) {
                System.out.print(type + " ");
                ans += type * size;
                truckSize -= type;
                
            } else {
                ans += truckSize * size;
                truckSize = 0;
            }

            if (truckSize == 0) {
                break;
            }

        }
     
        return ans;

        
    }
    public static void main(String[] args) {
    //    int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
    //    int truckSize = 10;
       int[][] boxTypes = {{1,3},{2,2},{3,1}};
       int truckSize = 4;
       System.out.println(maximumUnits(boxTypes, truckSize));
    }
}
