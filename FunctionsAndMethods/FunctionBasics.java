// new function
// PARAMETERS:-the values which are passed in parathesis(or defination) of function is known as parameters or formal parameters. 
// eg:- public static int Calculatesum(int num1 ,int num2)  , num1 & num2 are parameters.

// ARGUMENTS:-the values which are called or passes in a function is called arguments or actual parameters.
// Eg:- Calculatesum(a,b);      , a & b are arguments passed in calculate sum function.

import java.util.*;
public class FunctionBasics {
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    
    public static int Calculatesum(int num1 ,int num2){            // parameter names can also be int a and int b.
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
    Calculatesum(a,b);             // arguments or actual parameters
   } 
}
