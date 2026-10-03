// merge sort
public class Mergesortbasics {
    public static void main(String[] args) {
        int []arr = {2,5,9,3,1,8};
        Mergesort(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void Mergesort(int [] arr){ 
        int n = arr.length;
        if(n == 1) return ;
        int idx = 0;
        int []a = new int[n/2];
        int []b = new int[n - n/2];
        for(int i = 0 ; i < a.length;i++) a[i] = arr[idx++];
        for(int j = 0 ; j < b.length;j++) b[j] = arr[idx++];
        Mergesort(a);
        Mergesort(b);

        merge(a,b,arr);
    }
    public static void merge(int []a, int []b, int []arr){
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i < a.length && j < b.length){
        if(a[i] > b[j]) arr[k++] = b[j++];
        else arr[k++] = a[i++];
        }
        while(i < a.length) arr[k++] = a[i++];
        while(j < b.length) arr[k++] = b[j++];
    }
}
