public class Powerset {
    public static void main(String[] args) {
     String s = "jagrati";
     subsets("" , s, 0);
    }
    public static void subsets(String ans , String s , int idx){
        if(idx == s.length()){
            System.out.println(ans + " ");
            return;
        }
        int ch = s.charAt(idx);
        subsets(ans+ch , s , idx+1);
        subsets(ans , s , idx+1);
    }
}
