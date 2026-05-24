// didplay all numbers entered by user except the multiple of 10
import java.util.*;
public class ContinueQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       do {
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if (number%10==0) {
            continue;
        }
        System.out.println("Your number was :" + number);
         } while(true);
        
    }
}
