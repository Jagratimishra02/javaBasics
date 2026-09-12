import java.util.ArrayList;
public class StringBuilders {
    public static void main(String[] args) {
        // in order to change string we can make array list and then modify or we can use string builder/
        // ArrayList<Character> str = new ArrayList<>();
        // str.add('n');
        // str.set(0, 'j');     

        // +++++++++++++StringBuilder+++++++++++++++++ its time complexity is O(1);
         
        StringBuilder s = new StringBuilder("jagrati");   // it is like char array
          System.out.println(s.length()+ " " + s.capacity());   // this is like array list it has the more cpacity .
        System.out.println(s);
        s.append("mishra");
        System.out.println(s);

        // cpacity of empty stringbuilder 
        StringBuilder k = new StringBuilder();
        System.out.println(s.length()+ " " + s.capacity());  // o/p length = 0 , capacity = 16 

       // we can also give length to the string builder 
        StringBuilder y = new StringBuilder(6); 
        y.append("jagrati");
        System.out.println(y.length()+ " " + y.capacity());  // we can also increase length nd capacity .
        System.out.println(y);
        y.setCharAt(4, 'i');
        System.out.println(y);

        // change string builder to string 

        // String j = y;   // this is not applicable so we shouls use to string method 

        String j = y.toString(); // stringbuilder change into string 
        System.out.println(y);

    }
}
