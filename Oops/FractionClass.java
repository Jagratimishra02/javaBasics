class Fraction{
    int num ;
    int deno;
    Fraction(int num , int deno){
        this.num = num;
        this.deno = deno;
        simplify();
    }
    void print(){
        System.out.println(num + "/" + deno);  
    }
    void add(Fraction f){
        num = num * f.deno + f.num * deno ;     // 3 * 2 + 4 * 5 = 26
        deno = deno * f.deno;                   //   5 * 2 = 10 
        simplify();
    }
    void mul(Fraction f){
        num *= f.num ;                  // 3 * 4  = 12
        deno *= f.deno;                   //   5 * 2 = 10 
        simplify();
    }
    void divide(Fraction f){
        num = num*f.deno;
        deno = deno*f.num;               // divide
        simplify();
    }
    int hcf(int a,int b){
        if(a==0) return b;           // it takes the hcf
        return hcf(b%a, a);
    }
    void simplify(){                // it simply the fraction into simplest form
        boolean isNegative = (num*deno) < 0 ? true : false;    // to handle neg deno case.
        int d = hcf(num, deno);
        num = Math.abs(num);    // to make positive
        deno = Math.abs(deno);  // to make positive
        num = num /d;
        deno = deno/d;
        if(isNegative)  num = -num;  
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 2);
        f1.print();
        Fraction f2 = new Fraction(3, -5);
        // f2.add(f1);  f2.print();      // 26/10
        // f2.mul(f1);  f2.print();         // 12/10 
        f2.divide(f1); f2.print();
    }
}
