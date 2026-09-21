public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;

         //Method 1 - through loops
        // int rev = 0;
        // while(num!=0){
        //     rev = rev*10 +(num %10);
        //     num /= 10;
        // }
        // System.out.println(rev);
        
        System.out.println(reverse(num,0));
    }
    // method 2 through recursion
    public static int reverse(int num , int rev){
        if(num == 0) return rev;
        return reverse( num/10 ,rev*10+num%10);
    }

}
