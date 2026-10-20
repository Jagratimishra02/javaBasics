class Complex{
    int x;
    int y;
    double a;
    double b;
    Complex(int x , int y){
        this.x = x;
        this.y = y;
    }
    Complex(double a , double b){      // constructer for double values.
        this.a = a; 
        this.b = b;
    }
    void print(){
        if(y>=0) System.out.println(x + "+" + y + "i");     // print for x and y
        else System.out.println(x + "-" + -y + "i");
    }
    void printd(){
        if(a>=0) System.out.println(a + "+" + b + "i");         // print for a and b 
        else System.out.println(a + "-" + -b + "i");
    }
    void add(Complex z){
        this.x += z.x ;       // 8 + 3
        this.y += z.y ;       // -2 + 5
    }
    void multiply(Complex z){
        int newX = z.x * this.x - z.y * this.y ;       //  (3 * 8) - (-2 * 5)
        int newY = z.y * this.x + z.x * this.y;       //  (5 * 8) + (3 * -2)
        this.x = newX;
        this.y = newY;
    }
    void divide(Complex z){
        double d = z.a * z.a + z.b * z.b;        // (2.2 * 2.2) + (2.0 * 2.0)
        double newA = (this.a * z.a + z.b * this.b) / d;       //  (8.0 * 2.2 + 8.2 * 2.0)/d
        double newB = (this.b * z.a -  z.b *this.a) / d;       //  (8.2 * 2.2 + 2.0 * 8.0)/d
        this.a = newA;
        this.b = newB;
    }
}
public class ComplexNums {
    public static void main(String[] args) {
        Complex z1 = new Complex(8, -2);
        Complex z2 = new Complex(3, 5);
        z1.print();  z2.print();
        z1.multiply(z2); z1.print(); 
        Complex z3 = new Complex(8.0, 8.2); 
        Complex z4 = new Complex(2.2, 2.0); 
        z3.divide(z4); z3.printd();  
    }
}
