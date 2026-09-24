// to print array using Recursion first to last and last to first.
public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        // int n = arr.length-1; // length of the array

        recArr(arr,0); // to print array using Recursion first to last.
        // recArr(arr,n); // to print array using Recursion last to first.
        recReversearr(arr,0); // to print array using Recursion last to first.
    
    }

    // to print array using Recursion first to last.
    public static void recArr(int []arr , int idx){  
        int n = arr.length; // length of the array
        if(idx == n) return;
        System.out.println(arr[idx] + " "); // print the element at the current index
        recArr(arr, idx+1);
    }

    // // to print array using Recursion last to first.
    // public static void recArr(int []arr , int n){  
    //     if(n == 0) {
    //         System.out.println(arr[0] + " ");
    //         return;
    //     }
    //     System.out.println(arr[n] + " "); // print the element at the current index
    //     recArr(arr, n-1);
    // }

    // method to print array using Recursion last to first.
     public static void recReversearr(int []arr , int idx){  
        int n = arr.length; // length of the array
        if(idx < 0) return;
        System.out.println(arr[idx] + " ");  
        recReversearr(arr, idx-1); 
        // call first and then print the element at the current index printing in reverse order
    }
}
