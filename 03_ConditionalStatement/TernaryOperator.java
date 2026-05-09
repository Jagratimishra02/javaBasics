import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       String type = ((num % 2)==0)? "even" : "odd" ;
       System.out.println(type);

       int greater = (num>10)? num : 10 ;
       System.out.println("greater is " + greater);

       boolean isequalto12 = (num==12)? true : false;
       System.out.println(isequalto12);

    }
  
}
