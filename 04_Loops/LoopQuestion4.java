// reverse the number 
//  to get last digit of any number %10 ; for eg:- 34%10 = 4
// to remove last digit num/10 ; eg :- 34/10 = 3


public class LoopQuestion4 {
    public static void main(String[] args) {
    //    int n = 21204 ;
    //    while ( n > 0) {
    //    int lastDigit = n % 10;
    //    System.out.print(lastDigit);
    //     n = n/10; // n/=10 ;
    //    }


    // by using for loop 
          for (int n = 21204 ; n > 0; n = n/10) {
            int lastdigit = n%10;
            System.out.print(lastdigit);
          }
    }
}
