import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        String s = "nishi";
        change(s);
        String []arr = {"jago" , "jagrati" , "anshu" , "carino"};
        // every element of array can be printed
        // for(int i = 0 ; i < arr.length ; i++){
        //  System.out.print(arr[i] + " ");
        // }

        ArrayList<String> al = new ArrayList<>();
        al.add("kuchupuchu");
        al.add("rasmalai");
        al.add("hariom");
        al.add("dosa");
        al.add("maggie");
        al.add("pizza");
        System.out.println(al);
        chngArrList(al);
        System.out.println(al);
    }
    public static void change(String s){
        s = "krapansh";
        System.out.println();
    }

    public static void chngArrList(ArrayList<String> al){
       al.add("garlic bread");
    }
}
