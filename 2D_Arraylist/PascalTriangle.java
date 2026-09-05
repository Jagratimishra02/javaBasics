import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
     public static  List<List<Integer>> generate(int numRows) {
        // array list of array list created
        List<List<Integer>> ans = new ArrayList<>();
         for(int i = 0 ; i < numRows ; i++){
            ans.add(new ArrayList<Integer>());
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || i == j) ans.get(i).add(1);
                 else {
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
            
        } 
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;

        // method 1 to print array list and call function.
        System.out.println(generate(n));

        // or method 2 
        //  List<List<Integer>> result = generate(n);
        //  System.out.println(result);
  }
}
