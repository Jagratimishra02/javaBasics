import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();          
     String s = "" + n;
     // to count digits in n without using loop convert it into string then use s.length .
     System.out.println(s.length());   // if n = 000234 output is 3 , 3453 output = 4
    }
}
