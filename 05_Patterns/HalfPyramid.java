// half number pyramid question
public class HalfPyramid {
    public static void main(String[] args) {
        int n =4;
        for(int line = 1; line<=n ;line++){
            for(int num = 1; line>= num; num++) {                  // to print numbers
               System.out.print(num);
            }   
            System.out.println();     
        }
          
    }
}
