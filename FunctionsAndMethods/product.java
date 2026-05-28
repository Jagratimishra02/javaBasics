public class product {
    public static int multiply(int a, int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args) {
       int prod1 = multiply(3, 2);
       int a = 2;
       int b = 5;
       int prod2 = multiply(a, b);
       System.out.println("product 1 is: " + prod1);
       System.out.println("product 2 is: " + prod2);
    }
}
