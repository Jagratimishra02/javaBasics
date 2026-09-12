public class InterningNdNewKeyword {
    public static void main(String[] args) {
        // String j = "krapansh";
        // j.charAt(0) = e ;   // this is not applicable to change string or string characters they r immutable
        // immutable means can't change single character of string

        String s = "jagrati";
        String t = new String("jagrati");
        if(s == t) System.out.println("true");  // output gives false bcoz new keyword gives another address so they r not equal
        else System.out.println(false);

        // this concatination or addition in string has high time complexity and space complexity so we don,t use generally.
        String a = "jagrati";
        a += "mishra";


        // ++++++++ IN oder to change some character in string +++++++

        String k = "nisshi";
        k = k.substring(0,3)+"h"+k.substring(4);   //(0 to 3) nis + "h" +(4 to k.length)hi
        System.out.println(k);          // o/p is nishhi
        // but this method has high complexity and space complexity .



     // ++++++++++++++ s1 equals to s2 ++++++++++++.
      String m = "jago";
      String y = new String("jago");
       System.out.println(m == y);    // false bcox of new address
       System.out.println(m.charAt(0)==y.charAt(0)); // true bcoz it checks individual characters.

       // in order to check strings are equal by using single character at a time we can use 
       System.out.println(m.equals(y)); // so it gives true
    }
}
