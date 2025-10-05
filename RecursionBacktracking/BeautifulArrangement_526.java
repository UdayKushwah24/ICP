package InfinityChampionsProgram.RecursionBacktracking;

public class BeautifulArrangement_526 {

    static int count = 0;

    public static int countArrangement(int n) {

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Permutation(arr, 0);

        return count;
    }

    private static void Permutation(int[] arr, int j) {

        if (j == arr.length) {
            count++;
            return;
        }
        for (int i = j; i < arr.length; i++) {
            swap(arr, i, j);
            if (arr[j] % (j + 1) == 0 || (j + 1) % arr[j] == 0) {
                Permutation(arr, j + 1);
            }
            swap(arr, j, i);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countArrangement(n));
    }
}
