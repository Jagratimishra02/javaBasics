public class reverserowsNdColumns {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{2,4,6,8}};
        // to traverse outer array .
        for(int i = arr.length-1 ; i >= 0 ;i--){
            // to traverse inner array .  
             for(int j = arr[0].length-1 ; j >= 0 ; j-- ){
             System.out.print(arr[i][j]);
          }
          System.out.println();
        }
        
    }
}
