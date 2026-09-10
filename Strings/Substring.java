public class Substring {
    public static void main(String[] args) {
        String k = "krapansh";
        System.out.println(k);
        k = "jagrati";
        System.out.println(k);

        // k.charAt(0) = n ;    // this is not possible to change single char but we can modify the complete string 
        // System.out.println(k);

        k += 10 ;
        System.out.println(k);

        String n = "nishi" ; // substrings are = n i s h i ni sh ni nis ish shi 
        System.out.println(n.substring(2));          // o/p = shi
        System.out.println(n.substring(2,4));          //  end index gives less than the index.o/p = sh

        System.out.println(n.substring(1,n.length()));          //  end index gives less than the index.


        // ++++++++ All  substrings are +++++++

         String M = "mishra";
        //  m mi mis mish mishra 
        //  i is ish ishr ishra
        //  s sh shr shra
        //  h hr hra
        //  r ra
        //  a  
        for(int i =  0 ; i < M.length(); i++){
            for(int j = i ; j <= M.length(); j++){
                System.out.print(M.substring(i,j) + "  ");
            }
            System.out.println();
        }
    }
}
