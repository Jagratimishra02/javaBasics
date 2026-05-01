public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        System.out.println( a>b && b==a);     // logical and  => if one condition is false then o/p is false 
                                              // ,both should be true for true output

        System.out.println( a>b || a==b);      // logical OR => if one condition is true then o/p is true

        System.out.println(!(a<b));              // logical not => reverse / toggle the o/p , true becomes false ,false become  
    }
}
