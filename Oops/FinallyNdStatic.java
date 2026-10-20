class Cricketers{
    static final String country = "India";  // this value is final cannot be changed and common for all so we can use nd final both.
    int runs;
    static String name = "Krapansh";   // static means sharable.
    double average;
    static void greet(){
      System.out.println("All Indian crickets r good");      // static bcoz it is common for all 
    }
    void print(){
      System.out.println(runs + " " + name + " " + average);   // it can't be static bcoz it has arguments which is different 
    }
}
public class FinallyNdStatic {
    public static void main(String[] args) {
      Cricketers c1 = new Cricketers();
    //   c1.country = "england";            // error 
        System.out.println(c1.name);       // Krapansh
      Cricketers c2 = new Cricketers();
      c1.name = "anshu";
      // System.out.println(c1.name);         // anshu
      // System.out.println(c2.name);         // anshu
      c1.greet();
      c2.greet();
      c1.print();
      c2.print();
    }
}
