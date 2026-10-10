// to check and give the duplicate and mismatch element .
import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
        int []nums = {1,2,2,4}; // array created so that we can return array.

        // System.out.println(Arrays.toString(findErrorNums(nums))); // to print array as a string.
        
        System.out.print("[");
        findErrorNums(nums);

        // to print array 
       for (int k = 0; k < nums.length; k++) {
           System.out.print(nums[k]);
           if (k < nums.length - 1) System.out.print(", ");
        }
            System.out.println("]");

     }
     public static  int[] findErrorNums(int[] nums) {
        int []ans = new int[2];
        int i = 0 ;
        while(i < nums.length){
            int j = nums[i]-1;
            if(nums[i] == i+1 || nums[i] == nums[j]) i++ ; // if num is at correct position or repeated
            else {
                swap(i,j,nums);
            }
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i] != i+1) {
                ans[0] = nums[i]; // the number which is repeated
                ans[1] = i+1;     // the missing number
                break;
            }
        }
        return ans;
    }
    public static void swap(int i , int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
