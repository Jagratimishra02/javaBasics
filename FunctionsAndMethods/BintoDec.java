// binary to decimal conversion 
import java.util.*;
public class BintoDec {
    public static void BintoDec(int BinNum){
        int myNum = BinNum;
        int Pow = 0;
        int Decnum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            Decnum = Decnum + (lastdigit * (int)Math.pow(2, Pow));
            Pow ++ ;
            BinNum = BinNum/10;
        }
        System.out.println("decimal of " + myNum + "= " +  Decnum);
    }
    public static void main(String[] args) {
        BintoDec(111);
    }
}
