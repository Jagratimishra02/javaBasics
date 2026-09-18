public class GlobalVar {
    // global variable can be used globally ;
    static int x = 10 ;
    public static void main(String[] args) {
        fun();
        System.out.println(x);         // output is 20 .
    } 
    public static void fun(){
         x = 20;                       // x changed globally .
    }
}
