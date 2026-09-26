import java.util.*;

public class Powerset {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>();   // if we want to return list 
     String s = "abc";
     subsets("" , s, 0 , list);
      Collections.sort(list);
     System.out.println(list);
    }
    public static void subsets(String ans , String s , int idx , List<String> list){
        if(idx == s.length()){
            if (ans.length()!= 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch , s , idx+1,list);   // pick
        subsets(ans , s , idx+1,list);      // skip
    }
}
