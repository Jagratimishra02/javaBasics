import java.util.ArrayList;

public class Multiply2Matrices {
    public static ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // method 1 
        // int n = mat1.length;
        //         ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        //         for(int i = 0 ; i<n ; i++){
        //             ans.add(new ArrayList<>());
        //             for(int j = 0 ; j < n ; j++){
        //                 int sum = 0 ;
        //                 for(int k = 0 ; k < n ;k++){
        //                     sum += mat1[i][k] * mat2[k][j];
        //                 }
        //                 ans.get(i).add(sum);
        //             }
        //         }
        //         return ans;

        // method 2 
        int n = mat1.length;
        int [][]c = new int[n][n];  // new matrix created 
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<n ;j++){
                for(int k = 0 ; k<n ; k++){
                    c[i][j] +=( mat1[i][k] * mat2[k][j]);
                }
            }
        }
          ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        for(int i = 0 ; i<n ;i++){
           ans.add(new ArrayList<>());
            for(int j = 0 ; j<n ;j++){
                ans.get(i).add(c[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][]mat1 = {{1,2},{2,4}};
        int [][]mat2 = {{2,6},{8,2}};
       System.out.println(multiply(mat1, mat2));
    }
}
