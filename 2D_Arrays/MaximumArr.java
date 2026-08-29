// to find minimum of maximum of rows .
import java.util.Scanner;
public class MaximumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int [n][m];
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < m ; j++){
                // to take input
                 arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");  // to print

                // To find max of a row
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            // to find min of all max's
            if(max<min){
                min = max ;
            }
            System.out.println();
        }
        System.out.println(min);
    }
}
