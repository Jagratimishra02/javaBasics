// to find the missing number using cyclic sort
public class Missingnum {
   public static void main(String[] args) {
    int []arr = {9,6,4,2,3,5,7,0,1};
    System.out.println(missingnumber(arr));
   }
   public static int missingnumber(int[] arr){
    int i = 0 ;
    int n = arr.length;
    while(i<arr.length){
        if(arr[i] == i || arr[i] == n) i++;  // if element is at correct position or 
        // last index of bound condition
        else {
            int idx = arr[i];
            swap(i,idx,arr);
        }
     }
     for(i = 0 ; i < arr.length ; i++){
        if(arr[i] != i) return i ;
     }
     return n ;
   }
   // swap 
   public static void swap(int i , int idx ,int []arr){
     int temp = arr[i];
     arr[i] = arr[idx];
     arr[idx] = temp;
   }
}
