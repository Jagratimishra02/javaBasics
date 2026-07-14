// to print 2d array or matrix
import java.util.Scanner;

public class Matrics1 {
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
        findkey(matrix,5);
    }
}
