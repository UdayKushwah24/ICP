package Basic;

public class TowsComp {
    public static void main(String[] args) {
        // String str = "110010100";   //001101100  001101011
        String str = "11000101100";    //001101100  001101011    00111010100
        int n = str.length();
        int ind = 0;
        for (int i = n-1; i >= 0; i--) {
            if(str.charAt(i) == '1') {
                ind = i;
                // System.out.println(ind);
                break;
            }
        }
        String ans = "";
        for (int i = 0; i < ind; i++) {
            if(str.charAt(i) == '1') {
                ans += '0';
            } else {
                ans += '1';
            }
        }
        ans+='1';
        for (int i = ind+1; i < n; i++) {
            ans += '0';
        }
        System.out.println(ans);

      
    }
}
