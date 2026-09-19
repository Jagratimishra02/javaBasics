// recursive code 
import java.util.Scanner;

public class Recursivecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n == 0) return ;          // basecase
        System.out.print(n + " ");   // call
        print(n-1);                  // work
        System.out.print(n + " ");   // call
    }
}
