public class SumOfSubsstring {
    public static int sumSubstrings(String s) {
        // code here
     long res = 0 ;
     long sum = 0;
     int n = s.length(); 
     for(int i = 0 ; i < n ; i++){
        int digit = s.charAt(i) - '0';
        sum = sum*10 + (long)digit * (i+1);
        res += sum;
     }
     return (int)res;
    }
    public static void main(String[] args) {
        // String s = "6759";
        String s = "122";
        System.out.println(sumSubstrings( s));
    }
}
