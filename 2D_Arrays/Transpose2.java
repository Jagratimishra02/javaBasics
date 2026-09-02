public class Transpose2 {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{2,4,6,8},{3,6,5,7},{9,8,7,6}};
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){
               int temp = arr[i][j] ;
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
           
        }
         for(int []a : arr){
                for(int ele : a){
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
    }
}
