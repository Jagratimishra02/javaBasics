// To find missing element from array 
// Eg : {1, 2 , 4 ,5} ,Array length (n) = 4   => missing element is 3 
// orignal array without missing element should be => { 1, 2 ,3 ,4, 5 } here array length(n) becomes n+ 1 = 5

import java.util.Scanner;

public class MissingNum {
    public static void missingnum(long Arr[]){
         long n = Arr.length+1;               // array length can be in lakhs. if it is in lakhs then sum n(n+1)/2 will be long
        // not int

       // sum of orignal array which does not have missing element 
       long sum = n *(n+1)/2 ;        // sum can be long 

      // sum of array having missing num.
        long summissing = 0 ;
        for(long i : Arr){
            summissing += i;
        }
        System.out.println("missing element is : "  + (sum-summissing));  //  orignal array sum - missing array sum
    }
    public static void printArr(long Arr[]){
        for(long val : Arr){
            System.out.print(val + " ");
        }
        System.out.println();
      
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // to take input of length
    int index = sc.nextInt();
    long []Arr = new long[index];
    // to take input of elements
      int i = 0;
        while(i< index ){
           Arr[i] = sc.nextLong();
            i++;
        }
    printArr(Arr); 
    missingnum(Arr);
    }
}
