// to print the sum of subset of arrays through recursion.
import java.util.*;

public class SumOfsubsetOfArray {
   public static void main(String[] args) {
    int []arr = {1, 2, 1};
    System.out.println(subsetSums(arr));
   } 
    public static  ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helperfunction(ans,arr,0,0);
        Collections.sort(ans);    // to sort the array 
        return ans;
    }
    public static  void helperfunction(ArrayList<Integer>ans , int [] arr ,int idx,int sum){
        if(idx == arr.length) {
            ans.add(sum);
            return;
        }
        int i = arr[idx];
        helperfunction(ans, arr , idx+1,sum + i);  // pick
        helperfunction(ans , arr , idx+1,sum);     // skip
    }
}
