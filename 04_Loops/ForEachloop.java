// for each loop is used  to traverse a data stuctures , like array , linkedlists etc.
// it does not change the orignal array 

public class ForEachloop {
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5};
        for(int i : arr){
            System.out.print( i + " ");
        }

        // This will not work because it makes a new container for array , so orignal elements of array will not change

        // for(int i : arr){
        //     System.out.print( 2*i + " ");
        // }
    }
}
