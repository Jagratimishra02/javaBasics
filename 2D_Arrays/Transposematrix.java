// to print transpose of the matrix.
public class Transposematrix {
   public static void printsnake(int arr[][]){
     for(int i = 0 ; i < arr[0].length;i++){
        // rows reverse
        for(int j = 0 ; j < arr.length;j++){
            System.out.print(arr[j][i]);
        }
        System.out.println();
        }
       
      }
  
    public static void main(String[] args) {
         int [][] arr = {{1,2,3,4},{5,6,7,8},{2,4,6,8},{3,5,7,9},{9,7,6,3}};
        printsnake( arr);
    }
}

