import java.util.*;
public class HollowRec {
    public static void main(String[] args) {
        hollowRec(4 , 5);
    }
    public static void hollowRec (int rows, int columns){
        // outer loops 
        for(int i =1 ; i<=rows ; i++ ){
        // inner loops
        for(int j =1 ; j<=columns ; j++){
            if(i == 1 || i == rows|| j ==1 || j == columns){
                // boundaries of rectangle 
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        } 
        System.out.println();    
      }
    }   
}
