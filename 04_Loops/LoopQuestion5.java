// reverse the number and save that number 

public class LoopQuestion5 {
    public static void main(String[] args) {
        // int n = 21204;
        // int rev = 0;
        // while (n > 0) {
        //     int lastDigit = n % 10 ;
        //     rev = (rev*10) + lastDigit ;
        //     n = n/10;
           
        // } 
        // System.out.print(rev);


           int rev =0;
           for ( int n = 21204; n > 0 ; n = n/10 ){
            int lastdigit = n % 10;
             rev = (rev * 10) + lastdigit;

           }
            System.out.print(rev);
    }
}
