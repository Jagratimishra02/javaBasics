// number of unique paths from top left to bottom right in a m x n grid 
public class UniquePaths {
    public static void main(String[] args) {
       int m = 4;
        int n = 3 ;
        System.out.println(uniquePaths(m, n));  
    }

    // Method 1 
    //  public static int uniquePaths(int m, int n) {
    //     if(m == 1 || n == 1)return 1 ;  // if 3*1 return 1, if 1*3 return 1, if 1*1 return 1 
    //     // bcoz there is only one way to reach the destination
    //     return uniquePaths(m,n-1)+uniquePaths(m-1, n); // this gives tle error, bcoz we are calculating the same 
    //     // value again and again, so we can use memoization to store the values in a 2D array and return the value 
    //     // if it is already calculated
         
        
    //     //this is the recursive call, we can reach the
    //     //  destination from either top or left, so we add both the ways
    // }

    // Method 2
     public static int uniquePaths(int m, int n) {
        return Paths(0,0,m-1, n-1);
    }
     public static int Paths(int cr , int cc,int lr, int lc) {
        if(cr == lr && cc == lc) return 1; // if we reach the destination, return 1
        if(cr > lr || cc > lc) return 0; // if we go out of bounds, return 0 
        return Paths(cr+1, cc, lr, lc) + Paths(cr, cc+1, lr, lc); // we can move either down or right
        // int right = Paths(cr+1, cc, lr, lc);
        // int down = Paths(cr, cc+1, lr, lc); // we can move either down or right
        // return right + down;    // this also gives tle error, bcoz we are calculating the 
        // same value again and again, so we can use memoization to store the values in a 2D array and 
        // return the value if it is already calculated
    }
}
