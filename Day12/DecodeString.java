package InfinityChampionsProgram.Day12;
import  java.util.*;
public class DecodeString {
        public String decodeString(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<StringBuilder> string = new Stack<>();
        StringBuilder str = new StringBuilder();
        int num=0;
        for (char ch:s.toCharArray()){
            if(ch>='0' && ch <='9'){
                num= num*10 + ch -'0';
            }else if(ch=='['){
                string.push(str);
                str=new StringBuilder();
                number.push(num);
                num=0;
            }
            else if(ch==']'){
                StringBuilder temp = str;
                str=string.pop();
                int count = number.pop();
                while(count-->0){
                    str.append(temp);
                }
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }

}
