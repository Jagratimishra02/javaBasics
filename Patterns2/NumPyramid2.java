public class NumPyramid2 {
    public static void main(String[] args) {
        num_py(3);
    }
    public static void num_py(int n){
        for(int i = 1 ; i <= n ; i++){
            // spaces
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }
            // number pyramid  
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
