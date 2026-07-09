// integer = 1,-1 ,2,3,-4 
// not an integer = 3.2,4.5 , 8/9 (fractional and decimal number is not an integer)

import java.util.*;
public class IsIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();                       // eg: let n = 6.5
        int x = (int)n ;                                  // x = 6 ,  x != n or x-n != 0 ,so it is not an integer
        if(n == x){                 // or if(n-x == 0)
            System.out.println(n + " is an integer");
        } else {
            System.out.println(n + " is not an integer");
        }
    }
}
