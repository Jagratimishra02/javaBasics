// merge sort  ,Time complexity = O(n*logn) , space complexity = O(n*logn)
public class Mergesortbasics {
    public static void main(String[] args) {
        int []arr = {2,5,9,3,1,8};
        Mergesort(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void Mergesort(int [] arr){ 
        // length of array .
        int n = arr.length;
        if(n == 1) return ;
        int idx = 0;
        // step 1 : create two new arrays of n/2 and n-n/2 length.
        int []a = new int[n/2];
        int []b = new int[n - n/2];
         
        // step 2 : copy paste array into a and b .
        for(int i = 0 ; i < a.length;i++) a[i] = arr[idx++];
        for(int j = 0 ; j < b.length;j++) b[j] = arr[idx++];

        // step 3 : recursion : it diivides the array until length is 1 .
        Mergesort(a);
        Mergesort(b);

        // merge a and b into arr 
        merge(a,b,arr); // merge the array in sorted form.
    }
    public static void merge(int []a, int []b, int []arr){
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i < a.length && j < b.length){
        if(a[i] > b[j]) arr[k++] = b[j++];
        else arr[k++] = a[i++];
        }
        while(i < a.length) arr[k++] = a[i++]; // if b ends 
        while(j < b.length) arr[k++] = b[j++]; // if a ends 
    }
}
