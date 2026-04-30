
//Question 1: In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
// (Hint: Average of N numbers is sum of those numbers divided by N)


import java.util.*;
public class VarQuestion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("A enter karo: "); 
        double A = sc.nextDouble();
        System.out.println("A is " + A);
       
        System.out.println("B enter karo: "); 
        double B = sc.nextDouble();
        System.out.println("B is " + B);
            
        System.out.println("C enter karo: "); 
        double C = sc.nextDouble();
        System.out.println("C is " + C);

        double average = (A+B+C)/3;
        System.out.println("Average =  " + average);

        sc.close();

    }
}