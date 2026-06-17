import java.lang.reflect.Array;
import java.util.*;
public class Arrays02 {
    public static void main(String[] args) {
        int marks[] = new int [100];
        System.out.println("array length is " + marks.length);
        // System.out.println("length of array: " + Array.getLength(marks));
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // chemistry
        marks[2] = sc.nextInt(); // maths

        System.out.println("physics: " + marks[0]);
        System.out.println("chemistry: "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        // marks[2] =  100;   
        marks[2] = marks[2]+ 1;           // marks update
        System.out.println("maths: " + marks[2]);
        
        int percentage = (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("Percentage: " + percentage);
    }
}
