import java.util.*;
public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if (Num % 2 == 0) {
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }
    }
}