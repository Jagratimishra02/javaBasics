// To find maximum of three numbers using  nested ternary operator .
//  (condition ? true : false )

import java.util.*;
public class Ternary_Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number : ");
        int a = sc.nextInt();
        System.out.println("enter your second number : ");
        int b = sc.nextInt();
        System.out.println("enter your third number : ");
        int c = sc.nextInt();
        // nested ternary operator
        System.out.println("max is " + ((a >= b) ? ((a >= c)? a : c ): ((b >= c) ? b : c)));
    }
}
