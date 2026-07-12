// To print Ap series = 2, 5, 7, 11 , ... n terms. 
// last term formula = a + (n-1)*d   (here a is the first term , d is the difference between first and second , n = no of terms)

import java.util.*;
public class ApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // here n = number of terms
        // for(int i =2 ; i <= 3*n -1 ; i += 3){     // last term = a + (n-1)d , so it is 2 + (n-1)3 = 3*n-1
        //     System.out.print(i + " ");
        // }

        // ++++++++++++++++ Method 2 ++++++++++++++++++++++++ better
        int a = 4;
        int d = 6 ;
        for (int i = 1 ;i <= n ; i++){
            System.out.print(a + " ");
            a += d ;
        }
    }
}
