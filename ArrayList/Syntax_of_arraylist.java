import java.util.ArrayList;

public class Syntax_of_arraylist {
     public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<> ();
       arr.add(25);
       arr.add(21);
       arr.add(18);
       arr.add(5);
       arr.add(10);
       System.out.println(arr.get(2));       // for array we use arr[2] , but in array list we use arr.get(2).
     }
}
