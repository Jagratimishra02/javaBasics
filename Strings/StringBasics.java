package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        // String s = "this is java course";
        // System.out.println(s);

        // to take i/p
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // this prints complete line 
        System.out.println(s);      // output is "this is java course"
        String J = sc.next();       // this print the fist word before space
        System.out.println(J);      // output is "this"
    }
}
