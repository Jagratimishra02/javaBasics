import java.util.ArrayList;
import java.util.Collections;

public class Syntax_of_arraylist {
     public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<> ();
       arr.add(25);
       arr.add(21);
       arr.add(18);
       arr.add(5);
       arr.add(10);
       System.out.println(arr.get(2));       // for array we use arr[2] , but in array list we use arr.get(2).
       arr.set(2, 22);
       System.out.println(arr.get(2));   // this is analogous to arr[2] = 22 , in array .
       
       // to print the array list 

       // method 1 . direct it does not traverse
       System.out.println(arr);
       
       // method 2    for loop  .
       for (int i = 0 ; i < arr.size() ; i++){
        System.out.print(arr.get(i) + " ");
       }
        System.out.println();
        
        // method 3 for each loop 
       for(int ele: arr){
        System.out.print(ele + " ");
       }
       System.out.println();

       // add elements in array .
       // arr = 25,21,22,5,10 
       arr.add(78);    // 78 added  25,21,22,5,10,78
       arr.add(1 , 22);   // 22 added at index 1 ,  [25, 22, 21, 22, 5, 10, 78]
       System.out.println(arr);

       // to remove elements .
       arr.remove(arr.size()-1); // last element removed
       arr.remove(4);  // 4 removed at index 4 
       System.out.println(arr);   // [25, 22, 21, 22, 10]

       // to reverse arr list

       // method 1 
      //  Collections.reverse(arr);
      //  System.out.println(arr);

       // method 2
       int i = 0 , j = arr.size()-1;
       while(i < j){
        int temp = arr.get(i);
        arr.set(i , arr.get(j));
        arr.set(j, temp);
       i++;
       j--;
       }
       System.out.println(arr);
     }
}
