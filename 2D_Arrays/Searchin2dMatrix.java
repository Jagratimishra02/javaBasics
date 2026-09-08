public class Searchin2dMatrix {
        public static void main(String[] args) {
            int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
            System.out.println(searchMatrix(matrix,11));
        }
        public static  boolean searchMatrix(int[][] matrix, int target) {
        // using binary search   // time complexity log(m*n)
       int m = matrix.length;
       int n = matrix[0].length;
       int lo = 0;
       int hi = m*n-1;
       while(lo <= hi){
        int mid = lo + (hi - lo)/2;
       int midrow = mid/n;
       int midcol = mid%n;
        if(matrix[midrow][midcol] == target) return true;
        else if(matrix[midrow][midcol] < target) lo = mid+1;
        else hi = mid-1;
       }
       return false;

    //    int n = matrix.length; 
    //    int m = matrix[0].length;
    //    int i = 0 ;
    //    int j = m-1;
    //    while(i<n && j>=0) {           // time complexity =  O(m+n)
    //     if(matrix[i][j]<target) i++;
    //     else if(matrix[i][j]>target) j--;    
    //     else  return true;
    //     }
    //     return false;
    }
}
