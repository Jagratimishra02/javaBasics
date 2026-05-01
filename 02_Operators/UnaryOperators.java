import java.util.*;
public class UnaryOperators {
 public static void main(String[] args) {
       int a = 10;
       int b = ++a;               // pre increment 
       System.out.println(a);
       System.out.println(b);

       int x = 5;
       int c = x++;               // post increment
       System.out.println(x);     
        System.out.println(c);

       int y = 7;
       int d = --y;                // pre decrement
       System.out.println(y);  
       System.out.println(d);
       
       int z = 9;
       int e = z-- ;               // post drecrement
       System.out.println(z);
       System.out.println(e);
    }
}