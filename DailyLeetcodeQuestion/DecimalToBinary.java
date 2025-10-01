package Basic;

public class DecimalToBinary {

    public static void BinaryConverter(int n) {
        int ans = 0;
        int c = 0;
        while (n != 0) {
            int lastDigit = n % 2;
            ans = ans + (int)Math.pow(10, c++ )*lastDigit;
            n /= 2;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 11;
        BinaryConverter(n);
    }
}
