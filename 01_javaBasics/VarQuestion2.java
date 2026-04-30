
// Question 2: In a program, input the side of a square. You have to output the area of the square.
// (Hint: area of a square is (side x side))


import java.util.*;
public class VarQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("side Enter karo : ");
        float side = sc.nextFloat();
        System.out.println("side of square is : " + side);

        float Area = side*side;                                      // float * float = float, float*int = float
        System.out.println("Area of square is : " + Area );
        sc.close();
    }
}
