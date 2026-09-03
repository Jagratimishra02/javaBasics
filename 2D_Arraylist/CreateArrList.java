// to print arraylist of array list .
import java.util.ArrayList;
public class CreateArrList {
    public static void main(String[] args) {
        // to create array list 
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(9);a.add(7);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(8);b.add(2);b.add(6);b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7); c.add(1);c.add(5); c.add(9); c.add(2);c.add(8);

        // to create 2d arraylist , arraylist of arraylist
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); 
        arr.add(b);
        arr.add(c);
        
  //+++++++++++++++ to print array list +++++++++++

  // method 1 
        // System.out.println(arr);

  // method 2
        // for(int i = 0 ; i < arr.size() ; i++){
        //     for(int j = 0 ; j < arr.get(i).size(); j++){
        //         System.out.print(arr.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // method 3 
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
