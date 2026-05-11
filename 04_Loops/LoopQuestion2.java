// print number 1 to n , where n is the input taken by the user
import java.util.*;
public class LoopQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a input");
        int input = sc.nextInt();
        int i = 1;
        while (i<=input) {
           System.out.println(i); 
           i++;
        }
    }
}
