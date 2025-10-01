package Basic;

public class OnesComp {
    public static void main(String[] args) {
        String str = "11001100101";
        int n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '1') {
                ans += '0';
            } else {
                ans += '1';
            }
        }
        System.out.println(ans);
    }
}
