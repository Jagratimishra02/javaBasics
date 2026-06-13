// Question 5 :Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer");
        int integer = sc.nextInt();
        System.out.println(Sumint(integer));
    }
    public static int Sumint(int n){
        int num = n ;
        int sumOfDigits = 0;
        int lastDigit = 0 ;
        while (n>0) {
            lastDigit = n%10;
            sumOfDigits= sumOfDigits + lastDigit;
            n = n/10;
        }
        return sumOfDigits;
    }
}
