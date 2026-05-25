//  Question 3 : Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class factorialQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;   // to hold number
        int fact = 1 ; // to hold factorial
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (int i = 1 ; num>=i ; i++){
            fact *= i;
        }
        System.out.println("factorial of " + num + " is " + fact);
    }
}
