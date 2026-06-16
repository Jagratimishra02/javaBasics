// solid rhombus
public class Solid_Rhombus {
    public static void main(String[] args) {
        solid_Romb(5);
    }
    public static void solid_Romb(int n){
        for(int i = 1; i <= n ; i++){
            // for space
            for (int j = 1; j<= n-i; j++) {
               System.out.print(" "); 
            }
            // for stars
            for (int j =1; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
