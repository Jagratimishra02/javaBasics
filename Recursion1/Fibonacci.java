// Fibonacci series :- 0,1,1,2,3,5,8... .    n =  (n-1)+(n-2) , 3 = 2 + 1
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(series(n));
    }
    public static int series(int n){
        if(n == 0 || n ==1) return n;
        // it is known as depth first search . dfs
        return series(n-1)+series(n-2);  // calling two functions together.
    }
}
