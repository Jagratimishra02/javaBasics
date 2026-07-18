// To print Alternate pattern 

import java.util.Scanner;

public class AlternatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // int low = 1;
        // int high = n;

        // for (int i = 0; low <= high; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(high);
        //         high--;
        //     } else {
        //         System.out.println(low);
        //         low++;
        //     }
        // }

        // sc.close();


        //+++++++++++ METHOD 2+++++++++++++++++++
        
        int low = 1;
        int high = n;
        boolean toggle = true; // true matlab high se lena, false matlab low se

        while (low <= high) {
            if (toggle) {
                System.out.println(high);
                high--;
            } else {
                System.out.println(low);
                low++;
            }
            toggle = !toggle;
        }

    }
}