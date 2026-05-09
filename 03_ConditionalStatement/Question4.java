// largest of 3 numbers
public class Question4 {
    public static void main(String[] args) {
        int a = 1 , b = 3 , c = 6 ;
        if (a > b && a > c) {
            System.out.println("a is larger");
        } else if (b > c) {
          System.out.println("b is larger");  
        } else {
            System.out.println("c is larger");
        }
    }
}
