import java.util.Scanner;

public class Count_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // to hadle 0 input case 
        int count = 0 ;
        if ( n == 0){
        n = 2;          // replace 0 with any one digit number 
        }
        while( n != 0){
            n /= 10;
            count ++;
        }
        System.out.println(count);
    }
}
