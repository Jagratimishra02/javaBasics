public class PrimeNumCheck {
    public static boolean isPrime(int n){
        Boolean isPrime = true;
        for(int i = 2 ; i <= n-1; i++){
            if (n % i == 0) {              //Completely divide
              isPrime = false;
              break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(2));
       System.out.println(isPrime(8));
       System.out.println(isPrime(7));
    }
}
