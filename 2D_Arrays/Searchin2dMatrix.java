// to search in a matrix. 
// for [[1,2],[3,4]..n] = use binary search ....time complexity= O(log(m*n).
// for [[1,6],[3,7],[2,8]..n] = use method 2....time complexity= O(m+n).(last row element is greater so array can't be flattened)

public class Searchin2dMatrix {
        public static void main(String[] args) {
            int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
            System.out.println(searchMatrix(matrix,11));
        }
        public static  boolean searchMatrix(int[][] matrix, int target) {

      //++++++++++method 1 +++++++++++.
        // using binary search   // time complexity= O(log(m*n))
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

       // ++++++++++++++method 2+++++++++++++++++
       
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

/* binary search is applicable only if the array is globally(flattened) sorted  if arr is [1,2,3],[4....n] 
 if arr is [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22]] is sorted row and column wise but is may have the last low element
 bigger than the 1 st element of another row , if array is not globally sorted only row column wise sorted use method 2 */