public class S2egregate012 {
    public static void segrate(int []arr){
        int zeros = 0 ;
        int ones = 0 ;
        int twos = 0 ;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){  
            if(arr[i] == 0) zeros ++ ;        
            else if(arr[i] == 1) ones++ ;
            else twos++;
        }
          for(int j = 0 ; j < zeros ; j++){       // 0 1 2 = 0 
            arr[j] = 0;
        }for(int j = zeros ; j < zeros + ones;  j++){    // 3 4 5 = 1
            arr[j] = 1;
        }
        for(int j = zeros + ones ; j < zeros + ones+ twos ; j++){     // 6 7 8 = 2
            arr[j] = 2;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {1,0,0,2,2,2,2,0,1};  // 0001,2,2,2,0,1
        segrate(arr);
    }
}
