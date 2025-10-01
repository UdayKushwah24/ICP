package InfinityChampionsProgram.Day5;

import java.util.*;

public class LemonadeChange_860 {

    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (bills[0] != 5) {
            return false;
        }
        map.put(5, 1);
        map.put(10, 0);
        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.put(5, map.get(5) + 1);

            }

            if (bills[i] == 10) {

                map.put(10, map.get(10) + 1);

                if (map.get(5) > 0) {
                    map.put(5, map.get(5) - 1);
                } else {
                    return false;
                }
            }

            if (bills[i] == 20) {

                if (map.get(10) > 0 && map.get(5) > 0) {
                    map.put(5, map.get(5) - 1);
                    map.put(10, map.get(10) - 1);
                } else if (map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                } else {
                    return false;
                }
            }
        }

        return true;

    }

     
           public static boolean lemonadeChange1(int[] bills) {
        int five = 0, ten = 0; // count of ₹5 and ₹10

        for (int bill : bills) {
            if (bill == 5) {
                five++; // got a ₹5
            } else if (bill == 10) {
                if (five > 0) {
                    five--; // give one ₹5
                    ten++;  // keep one ₹10
                } else {
                    return false; // no ₹5 to give back
                }
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--; // give one ₹10
                    five--; // give one ₹5
                } else if (five >= 3) {
                    five -= 3; // give three ₹5
                } else {
                    return false; // can't give change
                }
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills));

    }
}
