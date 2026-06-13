// decimal to binary conversion
public class DectoBin {
    public static void dectoBin(int n){
        int myNum = n ;
        int Pow = 0 ;
        int BinNum = 0;
        while (n>0) {
            int rem = n % 2 ;
            BinNum = BinNum + (rem * (int)Math.pow(10, Pow));
            Pow++;
            n = n/2;
        }
        System.out.println("binNum of " +  myNum + "=" + BinNum);
    }
    public static void main(String[] args) {
        dectoBin(15);
    }
}
