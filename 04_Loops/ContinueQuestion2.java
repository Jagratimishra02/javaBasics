// check if the number is prime 
import java.util.*;
public class ContinueQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur number:");
        int n = sc.nextInt();
        boolean isprime = true;
        if ( n == 2) {
           System.out.println(n + " : number is prime"); 
        } else {
             for( int i = 2; i <= Math.sqrt(n); i++){
                  if (n % i == 0 ){     // if this is true then n is divided by i and i is not 1 and n
                  isprime = false; 
                  }
                    if (isprime== true) {
                     System.out.println(n + " it is prime number");
                     } else {
                     System.out.println(n + " not prime number");
                      }
            }
        }
    }
}
