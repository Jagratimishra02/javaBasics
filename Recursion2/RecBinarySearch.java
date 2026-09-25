public class RecBinarySearch {
     public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
        System.out.println(search(nums, 6));
     }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
    public static int helper(int[] nums, int target , int lo , int hi){
        if(hi<lo) return -1;
        int mid = lo + (hi-lo)/2 ;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }
}
