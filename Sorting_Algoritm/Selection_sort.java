// to select smallest and sort the array

public class Selection_sort {
    public static void selectionsort(int arr []){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            int minpos = i ;                         // let minimum position be arr[0](which is 1)
            for(int j = i + 1 ; j < n ; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j ;
                }
            }
            // swap 
            int temp = arr[minpos] ;
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,3};
    }
}
