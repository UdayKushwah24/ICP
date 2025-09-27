package InfinityChampionsProgram.Day2;

import java.util.*;

public class AsteroidCollision_735 {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int sum = a + stack.peek();

                if (sum < 0) {
                    stack.pop();

                } else if (sum > 0) {
                    a = 0;

                } else {
                    stack.pop();
                    a = 0;
                }

            }
            if (a != 0)
                stack.push(a);

        }
        int arr[] = new int[stack.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] asteroids = { -10, -2, -5, 4 };
        // int[] asteroids = { 10, 2, -5, 4 };
        // int[] asteroids = { 5, 10, -5 };
        // int[] asteroids = { 5, -5 };
        int ans[] = asteroidCollision(asteroids);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
