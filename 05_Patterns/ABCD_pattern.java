// To print pattern shown below : 
/* A A A A
   B B B B 
   C C C C  */

import java.util.Scanner;

public class ABCD_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch = 65;
        for(int i = 1 ; i <= n ; i++){        // to print column 
            for(int j = 1 ; j <= n ; j++){    // to print individual row
                System.out.print((char)(ch) + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
