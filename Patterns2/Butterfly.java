public class Butterfly {
    public static void main(String[] args) {
        
    }
    public static void Butterflypattern(int n){
        // for upward pattern
        for(int i = 1; i <= n; i++){
            // stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<= 2 *(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
        }

       // for dowmward pattern

        for(int i = n; i >= 1; i--){
            // repeat the exact same process as upward pattern

            // stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<= 2 *(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
        }
    }
}
