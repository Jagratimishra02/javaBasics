public class CompareToStringMethod {
    public static int CompareTo(String a,String b){
        int n = Math.min(a.length(),b.length());
        for(int i = 0 ; i < n ; i++){
            if(a.charAt(i) != b.charAt(i)) {
                return (a.charAt(i)-b.charAt(i)); 
            }
          }
          return(a.length()-b.length());
        }
    public static void main(String[] args) {
        String s = "nishi";
        String t = "mishra";
        // System.out.println(s.compareTo(t));    // m - j (asci of m - j)
        // System.out.println(t.compareTo(s));    // j - m (asci of m - j)


        String a = "khushiiq";
        String b = "khush";      // number of diffrent char is ans
        // System.out.println(a.compareTo(b));     // difference is 3 
        // System.out.println(b.compareTo(a));     // difference is -3


        // function compare to called and printed
       System.out.println(CompareTo(a,b)); 
       System.out.println(CompareTo(s,t)); 

    }
}
