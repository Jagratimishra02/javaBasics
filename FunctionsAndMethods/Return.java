//  to check mandatory conditions of return

public class Return {
    public static int return_check(int n){
        if( n > 0) return n ;
        // else is imp bcoz what if a first statement is false then what is returned in int 
        // ,so else is imp if function returns something .
        
        else return -1 ;            // we need to return anything in else also if uses "if " . it is mandatory
    }

    public static void main(String[] args) {
      System.out.println(return_check(6));  
    }
}
