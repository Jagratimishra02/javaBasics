// to print a pyramid 

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = 1 ; i <= n ; i++){
        //     // for spaces 
        //     for(int j = 1 ; j <= n- i ; j++){
        //         System.out.print("  ");
        //     }
        //     // for stars
        //     for(int k = 1 ; k <= 2*i-1 ; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//++++++++++++ Method 2 ++++++++++++++++++++++++++++

         int spaces = n-1 ;
         int stars = 1;
        for(int i = 1 ; i <= n ; i++){
            // for spaces 
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print(" " + " ");
            }
            // for stars 
            for(int k = 1 ; k <= stars ; k++){
                System.out.print("*" + " ");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
        
    }
}
