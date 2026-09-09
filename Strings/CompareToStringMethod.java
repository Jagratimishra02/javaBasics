public class CompareToStringMethod {
    public static void main(String[] args) {
        String s = "jagrati";
        String t = "Mishra";
        System.out.println(s.compareTo(t));    // m - j (asci of m - j)
        System.out.println(t.compareTo(s));    // m - j (asci of m - j)


        String a = "khushiiq";
        String b = "khush";      // number of diffrent char is ans
        System.out.println(a.compareTo(b));     // difference is 3 
        System.out.println(b.compareTo(a));     // difference is -3
        
    }
}
