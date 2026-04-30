// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output 
// the total cost of the items back to the user as their bill.
// (Add on: You can also try adding 18% GST tax to the items in the bill as an advanced problem)

import java.util.*;
public class VarQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of pencil:");
        float pencilCost = sc.nextFloat();
        // float GST = pencilCost + (pencilCost*(18/100));  // (18/100) is int so it gives 0.18 = 0 
        // float GST =  pencilCost  * 18/100;                         // we can also calculate gst individually
        System.out.println(pencilCost);
        // System.out.println(GST);

        System.out.println("Enter cost of pen:");
        float penCost = sc.nextFloat();
        System.out.println(penCost);

        System.out.println("Enter cost of Eraser:");
        float EraserCost = sc.nextFloat();
        System.out.println(EraserCost);

        float TotalCost = pencilCost +  EraserCost + penCost ;
        System.out.println(TotalCost);

        // BY applying GST on bill 

        float GST = TotalCost * 18f/100f ;
        float FinalBill = TotalCost + GST;
        System.out.println(FinalBill);

        sc.close();

   // Question 4: What will be the type of result in the following Java code?
          
        //   byte b = 4;
        //   char c = 'a';
        //   short s = 512;
        //   int i = 1000;
        //   float f = 3.14f;
        //   double d = 99.9954;

        //   result = (f * b) + (i % c) - (d * s);



// ANS: -  double is the type of result
 
 /*Kyun?

     f * b → float
     i % c → int
     d * s → double ← sabse bada type
     Jab double aata hai expression mein, poora result double ho jaata hai!   */


    }
}
