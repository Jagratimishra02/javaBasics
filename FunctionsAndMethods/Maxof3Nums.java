// to find maximum of three using functions .

public class Maxof3Nums {
    public static int max(int a , int b , int c){
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b ;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
      int x =  max( 4, 5 ,6);     
      System.out.println(max(8, x , 1));  // maximum of 3 
    }
}
