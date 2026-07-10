// it is used for short data its time complexity for best cases can be sometime O(n).it also handles duplicates.

public class Counting_Sort {
    public static void countingsort(int arr[]){ 
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
          largest =  Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int j = 0 ; j < arr.length ; j++ ){
            count[arr[j]]++;
        }
        int k = 0;
        for(int i = 0 ; i < count.length ; i++){
            while(count[i] > 0){
             arr[k] = i  ;
             k++;
             count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for (int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {5,4,4,2,7,3,4,2,1};
        countingsort(arr);
        printarr(arr);
    }
}
