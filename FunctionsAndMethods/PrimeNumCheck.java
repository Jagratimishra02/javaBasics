public class PrimeNumCheck {
    public static boolean isPrime(int n){
        Boolean isPrime = true;
        for(int i = 2 ; i <= n-1; i++){
            if (i % n == 0) {              //Completely divide
              isPrime = false;
            }
           
        }
    }
    public static void main(String[] args) {
        
    }
}
