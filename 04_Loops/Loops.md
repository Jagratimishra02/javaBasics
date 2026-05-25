# Question 1 : How many times 'Hello' is printed?

public class Solution {
public static void main(String[] args){
for(int i=0; i<5; i++) {
System.out.println("Hello");
i+=2;
}
}
}
 # Ans = 2


 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

# Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class ImpQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        int choice;
        int oddsum = 0;
        int evensum = 0;
        do {
            System.out.println("Enter your number : ");
            number = sc.nextInt();
            if (number%2 ==0) {
                evensum += number;
            } else {
                oddsum += number;
            } do {
                 System.out.println("do u want to continue if yes enter 1 else enter 0");
                 choice = sc.nextInt();
                 if (choice != 0 && choice != 1) {
                    System.out.println("invalid number! Enter valid number : 0 or 1");
                 }
            } while (choice != 0 && choice != 1);
           
        } while (choice == 1);
        System.out.println("Sum of even numbers : " + evensum);
        System.out.println("Sum of odd numbers : " + oddsum);
    }
}

  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

  # Question 3 : Write a program to find the factorial of any number entered by the user.

   # (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * ...... * 1 and exists for positive
   # numbers only. We write factorial as n!
   # So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
   # Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)


        import java.util.*;
        public class factorialQuestion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num ;   // to hold number
            int fact = 1 ; // to hold factorial
            System.out.println("Enter a number");
           num = sc.nextInt();
              for (int i = 1 ; num>=i ; i++){
               fact *= i;
            }
           System.out.println("factorial of " + num + " is " + fact);
        }
    }

     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

 # Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
     
        import java.util.*;
        public class TableQuestion {
           public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter your number");
          int num = sc.nextInt();
          int mul  ;
           for (int i = 1 ; i <= 10 ; i++ ){
             mul = num * i ;
             System.out.println(num + "*" + i + "=" + mul);
          }
    
      }
   }

# Question 5 :What is wrong in the following program?
   
   public class Solution {
   public static void main(String args[]) {
    for(int i = 0; i <= 5; i++ ) {
      System.out.println("i = " + i );
    }
      System.out.println("i after the loop = " + i );              // this line will show error i is not available outside scope
     }
 }

 

 # ans :- i can not be declared outside 