import java.util.Scanner;

public class FunctionCalingItself {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);  // we need two parameter so one we can change , nd one constant.
    }
    // to print 1 to n
    public static void print(int x,int n){
        if(x>n) return ;
        System.out.println(x);
        print(x+1,n);
    }
}
 