//if more than 1 number is duplicate.
import java.util.*;
public class Multipleduplicates {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
      List<Integer> ans = new ArrayList<>();
      int i = 0 ; 
      while(i < nums.length){
         int j = nums[i]-1;     //  j is the right index
        if(nums[i] == i+1 || nums[i] == nums[j]) i++;
        else {
            swap(i,j,nums);
        }
      }
      for(i = 0 ; i<nums.length ; i++){
        if(nums[i] != i+1) ans.add(nums[i]);
      } 
      Collections.sort(ans); //  if wants sorted order
      return ans;
    }
    public static  void swap(int i ,int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}