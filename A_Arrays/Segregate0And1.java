// To segregate 0's and 1's using two pointer method

public class Segregate0And1 {
    public static void segregate(int arr[]){
      int n = arr.length ;
      int i = 0;
      int j =n-1;
       while (i < j){
        if (arr[i] == 0){
            i++;
        }
        else if(arr[j] == 1){
            j--;
         }  
         else if( arr[i]== 1 && arr[j] == 0){
            arr[i] =  0;
            arr[j] = 1;
            i++ ;
            j-- ;
         }
        }
      }
   
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,0,0};
        segregate(arr);
        // to print an array using for each loop 
       for(int ele : arr){
           System.out.print(ele); ;
       }
       System.out.println();
    }
}
