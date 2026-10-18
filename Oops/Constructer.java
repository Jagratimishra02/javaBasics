// constructer is a type of method with the help of constructers we can directly pass the values diectly  during the 
// object initialisation .
public class Constructer {
    public static class car{
        int seats;
        String name;
        double length;
        
        // Constructers
        car(int x, String s, double l){
            seats = x;
            name = s;
            length = l; 
        }

        // default constructer
        car(){

        }

        // print method 
        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }
    public static void main(String[] args) {
        car c1 = new car(4,"mercedes",5.7);
        c1.print();
        car c2 = new car(4, "bmw" , 5.0);
        c2.print();
        car c3 = new car(2, "lambo" , 6.0);
        c3.print();
        car c4 = new car(2, "buggati" , 4.5);
        c4.print();
    }
}
