// Recursion refers to function calling itself.

import java.util.Scanner;

public class Rec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    // to print 5 to 1
    public static void print(int n){
        if(n == 0) return ;
        System.out.println(n);
        print(n-1);
    }
}
