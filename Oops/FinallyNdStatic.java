class Cricketers{
    final String country = "India";  // this value is final and cannot be changed.
    int runs;
    static String name;
    double average;
}
public class FinallyNdStatic {
    public static void main(String[] args) {
      Cricketers c1 = new Cricketers();
    //   c1.country = "england";          // error 
      Cricketers c2 = new Cricketers();
    }
}
