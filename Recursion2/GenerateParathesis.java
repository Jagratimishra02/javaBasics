
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParathesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(generateParenthesis(n));
    }
     public static List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        helperfunction(n,0,0,ans,"");
        return ans;
    }
    public static void helperfunction(int n , int left , int right ,List<String> ans,String s){
        if (s.length() ==2*n) {
           ans.add(s);
            return;
            }
        if (left<n) helperfunction(n,left+1, right,ans, s + "(");  
        if (left>right)helperfunction(n,left, right+1,ans,s + ")");
    }
}
