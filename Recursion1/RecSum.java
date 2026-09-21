// sum of number n . example ,n=3:sum = 1+2+3 
import java.util.Scanner;
public class RecSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        // method 1 using maths .
        // return n*(n+1)/2;  fastest

        // method 2  recursion
        if(n ==1) return 1;
        // if(n ==0) return 0;
        return n+sum(n-1);
    }
}
