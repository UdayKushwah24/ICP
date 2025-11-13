package InfinityChampionsProgram.Day12;
import  java.util.*;
public class SimplifyPath {
     public String simplifyPath(String path) {
        return simplified_string(path);
    }
    public static String simplified_string(String path){
        String [] arr=path.split("/");
        Stack <String> st=new Stack<>();
        for(String i : arr){
            if(i.equals("..") && !st.isEmpty()){
                st.pop();
            }else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                st.push(i);
            }
        }
        // System.out.print(st);
        StringBuilder sb = new StringBuilder();
        for(String i : st){
            sb.append("/");
            sb.append(i);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}
