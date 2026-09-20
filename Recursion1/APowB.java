// to find a power b value . through recursion .
import java.util.Scanner;

public class APowB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the base");
        int a = sc.nextInt();
        System.out.println("Enter exponent");
        int b = sc.nextInt();
        // method 1 inbuilt method 
        // System.out.println(a + " raised to power " + b + " is " + Math.pow(a, b));

        // method 2 
         System.out.println(a + " raised to power " + b + " is " + pow(a, b));
    }
    public static int pow(int a , int b){
        //   Extra space is taken
        // if(b == 0) return 1;
        // return a*pow(a, (b-1));

        // method 3 
           if(b == 0) return 1;
           int num = pow(a, b/2);
        if(b % 2 == 0) return num*num;   // num var created bcox calling methods again and again is pathetic.
        else return num*num*a;
    }
}
