public class HollowRombus {
    public static void main(String[] args) {
       hollow_rombus(7); 
    }
    public static void hollow_rombus(int n){
        for(int i = 1 ; i <= n; i++){
            // for spaces
            for(int j = 1; j<= n-i ; j++){
                System.out.print(" ");
            }
            // for hollow rectangle ( stars in the boundary of rec bcoz of spaces it will form rhombus)
            for(int j = 1; j<=n; j++)
            if( i == 1 || i == n || j == 1 || j == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
