// inbuilt sort in an algorithm already build in java , its time complexity is O(n).
// package meeded - import java.util.Arrays; 
// algorithm - Arrays.sort(arr);

import java.util.Arrays;
public class Inbuilt_sort {
    public static void printarr(int arr[]){
        for (int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5,4,1,2,3};
         Arrays.sort(arr);

        // for particular index sort
        //Arrays.sort(arr,0 ,3);       // here  0 is starting is ending index + 1

        printarr(arr);
    }
}


// to reverse an array 
// package used :-import java.util.Collections;
// algorithm- Arrays.sort(arr,Collections.reverseOrder());
// for particular index :- Arrays.sort(arr,si , ei,Collections.reverseOrder()); 
// // si is starting index , ei is ending index + 1




