
public class InversionCount {
    public static void main(String[] args) {
        int []arr = {2,4,1,3,5};
        System.out.println(inversionsort(arr));
    }
    static int count;
    public static int inversionsort(int []arr){
        count = 0 ;
         mergesort(arr);
         return count ;
    }
    public static void mergesort(int []arr){
      int idx = 0;
      int n = arr.length;
      if(n == 1) return;
      // step 1 :- divide array into 2 new array a and b.
      int []a = new int[n/2];
      int []b = new int[n-n/2];

      // step 2  :- copy paste elements into new arrays.
      for(int i = 0 ; i < a.length;i++) a[i] = arr[idx++];
      for(int j = 0 ; j < b.length;j++) b[j] = arr[idx++];

      // step 3:- recursion unit the n == 1
      mergesort(a);
      mergesort(b);

      // step 4 : - merge a,b into orignal array 
      merge(a,b,arr);
    }
    public static void merge(int []a ,int []b ,int []arr){
    int i = 0 ;
    int j = 0 ;
    int k = 0 ;
    // until i < a.length & j < b.length.
     while(i < a.length && j<b.length){
        if(a[i] <= b[j]) arr[k++] = a[i++];
        else {
           count += (a.length-i);  // if a[i] is greater than b[i] count = length - i 
           arr[k++] = b[j++]; 
        }
     } 
     while(i < a.length) arr[k++] = a[i++];
     while(j < b.length) arr[k++] = b[j++];
    }
}
