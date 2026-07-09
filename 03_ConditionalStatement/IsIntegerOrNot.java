import java.util.*;
public class IsIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n ;
        if(n == x){                 // or if(n-x == 0)
            System.out.println(n + " is an integer");
        } else {
            System.out.println(n + " is not an integer");
        }
    }
}
