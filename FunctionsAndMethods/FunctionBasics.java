// new function
import java.util.*;
public class FunctionBasics {
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    
    public static int Calculatesum(int num1 ,int num2){              // parameter names can also be int a and int b.
        Scanner sc = new Scanner(System.in);
        int sum = num1+num2;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    printHelloWorld();
    Calculatesum(a,b);
   } 
}
