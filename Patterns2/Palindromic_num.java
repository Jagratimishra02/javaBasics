// palindromic pattern with numbers
public class Palindromic_num {
    public static void main(String[] args) {
        palindrome_num(5);
    }
    public static void palindrome_num(int n){
        for(int i = 1 ; i <= n ; i++){
            // spaces
            for(int j =1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            // assending number pattern
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            // descending number patterns
            for(int j = 2 ; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
