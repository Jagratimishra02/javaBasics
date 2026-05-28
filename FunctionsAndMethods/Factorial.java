// factorial of any number by making any using other function.
public class Factorial {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1;i <= n; i++) {
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
       System.out.println(factorial(4)); 
    }
}
