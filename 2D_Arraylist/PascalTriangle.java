import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
     public List<List<Integer>> generate(int n) {
        // array list of array list created
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
           //  arraylist added into empty arraylist
            ans.add(new ArrayList<Integer>());
            for(int j = 0 ; j <= i ; j++){
                if(i == 0 || i == j) ans.get(i).add(1);
                else {
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }
}
