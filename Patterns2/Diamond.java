public class Diamond {
    public static void main(String[] args) {
        diamond(5);
    }
    public static void diamond(int n){
    // upper pattern 
    for(int i = 1 ; i <= n ; i++){
        // spaces
        for(int j = 1 ; j <= n-i ; j++){
            System.out.print(" ");
        }
        // for stars
        for(int j = 1 ; j <= (2*i)-1; j++){
            System.out.print("*");
        } 
        System.out.println();
    }
    // downward pattern 
    for(int i = n ; i >= 1 ; i--){
        // for spaces
        for(int j = 1 ; j <= n-i ; j++){
            System.out.print(" ");
        }
        // for stars
        for(int j = 1 ; j <= (2*i) -1 ; j++){
            System.out.print("*");
        }
        System.err.println();
      }
  }
}
