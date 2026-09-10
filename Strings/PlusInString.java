public class PlusInString {
    public static void main(String[] args) {
        // String s = "nishi";
        // String k = "Krapansh";
        // s += 22;
        // s += k ;                       // it does the same work as concatination 
        // s += '\n' ;                     // it gives the next line  
        // s += 02 ;                       
        // System.out.println(s); 

        System.out.println(22 + 02 + "nishi");              //  o/p = 24nishi
        System.out.println(22 + "nishi" + 02);              //  o/p = 22nishi2
        System.out.println("nishi" + 02 + 22);              // o/p = nishi222
        System.out.println("nishi" + (02 + 22));            // o/p = nishi24
        System.out.println('A'+ 2 + "nishi");               //  a is 65  , integer has priority than char , o/p = 67nishi.
    }
}
