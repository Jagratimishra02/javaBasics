// to print an multidimentional array using for each loop 

public class ForEach {
    public static void main(String[] args) {
        int arr[][] = {{5,6,2,3},{3,5,1,2},{9,4,6,8}};
        // for(int i = 0 ; i < arr.length;i++){
        //     for(int ele : arr[i]){
        //         System.out.print(ele + " ");
        //     }
        //       System.out.println();
        // }

        for(int []a : arr){
            for(int ele : a ){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
