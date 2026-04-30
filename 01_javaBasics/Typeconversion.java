import java.util.*;
public class Typeconversion {

    public static void main(String[] args) {

        // widening 
        int a = 25;
        long b = a;  // int< long

        System.out.println(b);

        // narrowing (lossy conversion)
        long c = 7L;
        int d = (int)c;
        System.out.println(d);

    Scanner sc = new Scanner(System.in);
    float number = sc.nextInt();
    System.out.println(number);  // int will convert into float ,eg:- 7 to 7.0


    float x = 7.88F;
    int y = (int)x;
    System.out.println(y);   // y = 7 , values will not round off just after decimal data will be lost7

    char ch = 'a';
    int number1 = ch;   // a = 97 , b = 98
    System.out.println(number1);


     char ch2 = 'b'; 
     // int number2 = ch2;
    System.out.println((int)ch2);  // method 2 shortcut without declaring variable



    // TYPE PROMOTION in Java   (char,byte,short => int)

    //1. Java automatically promotes each byte,char or short operand to int when evaluating an expression.

    //2. If one operand is long ,float or double the whole expression is promoted to long ,float or double respectively.


    char X = 's';
    char Y = 't';
    System.out.println(X); // type promotion is possible only with expression (+,-,*,%)
    System.out.println(Y-X); // java converts char,byte,short into int type

    

    int i = 4;
    float e = 3.25F;
    long f = 4L;
    double g = 30;
    double ans = (i+e+f+g);  // char Z = (int)(Y-X);   // X,Y converts to int by type promotion & int cannot be converted into char(conversion is possible but 
                            //  only by type promotion)
    System.out.println(ans);



    byte anshu = 22 ;
    byte nishi = (byte)(anshu*2);
    System.out.println(nishi);

    }
}