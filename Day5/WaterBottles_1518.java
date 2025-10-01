package InfinityChampionsProgram.Day5;

public class WaterBottles_1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int b = numBottles;
        while (numBottles >= numExchange) {
            int remain = numBottles % numExchange;
            int nayi = numBottles / numExchange;
        
            b += nayi;
            numBottles = nayi + remain ; 
        }
         
        return b;
    }
    

    public static void main(String[] args) {
        // int bottles = 9;
        // int exchange = 3;
        int bottles = 15;
        int exchange = 4;
        System.out.println(numWaterBottles(bottles, exchange));
    }

}
