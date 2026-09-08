// To check string is palindrome or not .
package Strings;
import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String s) {
        int start = 0 ;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
   }  
}
