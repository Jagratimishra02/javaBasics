// To print snake pattern columnwise

public class ColumnSnakepattern {
    public static void printsnake(int arr[][]){
        // to traverse outside array .
        for(int i = 0 ; i < arr.length ;i++ ){
            // to traverse inner array which divides by 2 , row 0,2,4
            if(i % 2 == 0) {
                for(int j = 0 ; j < arr[i].length ; j++){
                    System.out.print(arr[i][j] + " ");
                } 
                // to traverse  inside array which is odd , row = 1,3,5 .
              } else { for(int j = arr[i].length-1; j >= 0 ; j-- ){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{2,4,6,8},{3,5,7,9}};
        printsnake( arr);
    }
}