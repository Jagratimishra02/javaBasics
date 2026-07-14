// to print 2d array or matrix
// and to find key 
import java.util.Scanner;

public class Matrics1 {
    public static void max(int matrix[][]){
        // To calculate maximun
         int max = Integer.MIN_VALUE;  // to calculate maximum of the matrix
        for(int i = 0 ; i < matrix.length ;i++){
            int max2 = Integer.MIN_VALUE;   // to calculate max for every row
            for (int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] > max ){
                    max = matrix[i][j];
                }
            }
            // System.out.println(max2);
        }
        System.out.println("maxumum of array is " + max);
    }
    // public static void max(int matrix[][]){
    //     // To calculate maximun
    //      int max = Integer.MIN_VALUE;  // to calculate maximum of the matrix
    //     for(int i = 0 ; i < matrix.length ;i++){
    //         int max2 = Integer.MIN_VALUE;   // to calculate max for every row
    //         for (int j = 0 ; j < matrix[0].length; j++){
    //             if(matrix[i][j] > max ){
    //                 max = matrix[i][j];
    //             }
    //         }
    //         // System.out.println(max2);
    //     }
    //     System.out.println("maxumum of array is " + max);
    // }
    // To find key 
    public static boolean findkey(int matrix[][] , int key){
        for(int i = 0 ; i < matrix.length ;i++){
            for (int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key at cell " + "(" + i + "," +  j + ")");
                    return true;
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        Scanner sc = new Scanner (System.in);
        // input
        int n = matrix.length, m = matrix[0].length;
        // columns
        for (int i = 0 ; i < n ; i++){
            // rows
            for(int j = 0 ; j < m ; j++){
             matrix[i][j]= sc.nextInt();
            }
        }
        // to print array
        for (int i= 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        findkey(matrix,5);  // key =  5
        max(matrix);
    }
}
