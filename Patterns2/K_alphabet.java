public class K_alphabet {
    public static void main(String[] args) {
        print_k(7);
    }
    public static void print_k(int n){
        for(int i = 1; i<=n ; i++){
            // for stars
            for(int j = 1 ; j <= n ; j++ ){
                System.out.print("*");
            }
            // for spaces
            for(int j = 1 ; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // for stars 
            for(int j = 1; j<= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        // for downward pattern
            for(int i = n; i >= 1;i--){
              // for stars
               for(int j = 1 ; j <= n ; j++ ){
                System.out.print("*");
                }
              // for spaces
               for(int j = 1 ; j <= 2*(n-i); j++){
                System.out.print(" ");
               }
               // for stars 
               for(int j = 1; j<= n ; j++){
                System.out.print("*");
               }  
             System.out.println();
           }
    }
}
