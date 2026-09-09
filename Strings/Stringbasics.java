package Strings;

import java.util.Scanner;
// Strings are pass by value they does not change the orignal value . 
public class Stringbasics {
    public static void change(String s){
        s = "nishi";
    }

    public static void main(String[] args) {
        // String s = "this is java course";
        // System.out.println(s);

        // to take i/p
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();   // this prints complete line 
        // System.out.println(s);      // output is "this is java course"
        // String J = sc.next();       // this print the fist word before space
        // System.out.println(J);      // output is "this"


        String s  = "jagrati";
        System.out.println(s); 
        change(s);
        System.out.println(s); // s does not change bcoz string is pass by value 
         s = "krapansh";   // here this is changeable but cannot change in another function / object .

    }
}
