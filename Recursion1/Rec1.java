// Recursion refers to function calling itself.
public class Rec1 {
    public static void main(String[] args) {
        print(5);
    }
    // to print 5 to 1
    public static void print(int n){
        if(n == 0) return ;
        System.out.println(n);
        print(n-1);
    }
}
