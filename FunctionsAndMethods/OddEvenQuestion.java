// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test
// your method.
import java.util.*;
public class OddEvenQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num + " number is Even");
        }else{
            System.out.println(num + " number is odd");
        }
    }
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
