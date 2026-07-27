// To find missing element from array 
// Eg : {1, 2 , 4 ,5} ,Array length (n) = 4   => missing element is 3 
// orignal array without missing element should be => { 1, 2 ,3 ,4, 5 } here array length(n) becomes n+ 1 = 5

import java.util.Scanner;

public class MissingNum {
    public static void missingnum(int Arr[]){
        int n = Arr.length+1;
       // sum of orignal array which does not have missing element 
        int sum = n *(n+1)/2 ;

      // sum of array having missing num.
        int summissing = 0 ;
        for(int i : Arr){
            summissing += i;
        }
        System.out.println(sum-summissing);  //  orignal array sum - missing array sum
    }
    public static void printArr(int Arr[]){
        for(int val : Arr){
            System.out.print(val + " ");
        }
        System.out.println();
      
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // to take input of length
    int index = sc.nextInt();
    int []Arr = new int[index];
    // to take input of elements
      int i = 0;
        while(i< index ){
           Arr[i] = sc.nextInt();
            i++;
        }
    printArr(Arr); 
    missingnum(Arr);
    }
}
