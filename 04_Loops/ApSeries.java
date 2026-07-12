import java.util.*;
public class ApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // here n = number of terms
        for(int i =2 ; i <= 3*n -1 ; i += 3){     // last term = a + (n-1)d , so it is 2 + (n-1)3 = 3*n-1
            System.out.print(i + " ");
        }
    }
}
