//Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

import java.util.*;
public class Question6 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String Answer = (num < 0 )? "negative" : "positive";
    System.out.println(Answer);
}
    
}