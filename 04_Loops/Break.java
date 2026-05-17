//break:- break is used to exit the loop
public class Break {
    public static void main(String[] args) {
       for(int i=0; i<=5 ; i++){
        if (i==3) {
            System.out.println(i);
            break;
        }
         System.out.println(i);
      }
        System.out.println("i am out of the loop");
    }
}
