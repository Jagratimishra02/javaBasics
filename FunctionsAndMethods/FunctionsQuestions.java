// Question 1 : Write a Java method to compute the average of three numbers..
import java.util.*;
public class FunctionsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");  
        double x = sc.nextDouble();
        System.out.println("Enter your second number: ");
        double y = sc.nextDouble();
        System.out.println("Enter your third number: ");
        double z  =sc.nextDouble();
        System.out.println("The average of three numbers : " + averageNums(x, y, z)); 
        // System.out.print("The average value is " + averageNums(x, y, z)+"\n" );
    }
    public static Double averageNums(double x, double y, double z){
        return (( x + y + z )/3);
    }
}
