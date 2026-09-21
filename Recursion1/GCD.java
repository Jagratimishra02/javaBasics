// to find hcf using loops and recursion
public class GCD {
     public static int gcd(int a, int b) {
       // Method 1 using loops
    //     for(int i = Math.max(a, b); i >= 1 ; i--){
    //     if(a%i == 0 && b%i==0){
    //         return i ;
    //      }
    //   }
    //   return 1;

    // method 2 recursion
    if(a==0) return b;
    return gcd(a%b ,a);
    }
    public static void main(String[] args) {
        System.out.println(gcd(8, 16));
    }
}
