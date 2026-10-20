class Fraction{
    int num ;
    int deno;
    Fraction(int num , int deno){
        this.num = num;
        this.deno = deno;
    }
    void print(){
        System.out.println(num + "/" + deno);  
    }
    void add(Fraction f){
        num = num * f.deno + f.num * deno ;     // 3 * 2 + 4 * 5 = 26
        deno = deno * f.deno;                   //   5 * 2 = 10 
    }
    void mul(Fraction f){
        num *= f.num ;                  // 3 * 4  = 12
        deno *= f.deno;                   //   5 * 2 = 10 
    }
    void divide(Fraction f){
        num = num*f.deno;
        deno = deno*f.num;
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 2);
        f1.print();
        Fraction f2 = new Fraction(3, 5);
        // f2.add(f1);  f2.print();      // 26/10
        // f2.mul(f1);  f2.print();         // 12/10 
        f2.divide(f1); f2.print();
    }
}
