public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "jagrati Mishra" ;
        // System.out.println(s.indexOf('a'));        // index = 1 it gives first a .
        // System.out.println(s.indexOf('k'));        // index = -1, if not present 
        // System.out.println(s.indexOf('i'));        // index = 6 
        // System.out.println(s.indexOf(' '));        // index = 7 , space index is 7

        //++++++++++ in order to access last index +++++++++++.

        System.out.println(s.lastIndexOf('a'));  

        s.toLowerCase();  // this doesn't work  .


         s = s.toLowerCase(); 
         System.out.println(s);   // this can work



        // System.out.println(s.toLowerCase()); 
        System.out.println(s.toUpperCase()); 
        System.out.println(s.contains("jag"));// for single char use single quotes , for complete string or more than 1 char use "".
          
        if(s.contains("rati")) {
            System.out.println("life is better place with having u in it");
        }

        System.out.println(s.startsWith("jag"));    // true 
        System.out.println(s.startsWith("ag"));     // false 
        System.out.println(s.endsWith("ra"));      // true

    }
}
