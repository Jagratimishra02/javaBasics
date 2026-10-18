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
        car(){                 // default constructer

        }

        // print method 
        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }
    public static void main(String[] args) {
        // new object c1 created
        car c1 = new car(4,"mercedes",5.7);
        c1.length = 6.0;  // we can modify and update the values.
        c1.print(); // access to the method of class for that object 
        car c2 = new car(4, "bmw" , 5.0);
        c2.print();
        car c3 = new car(2, "lambo" , 6.0);
        c3.print();

        //+++++++++++++++ constructer overloading ++++++++ bcoz we have default and arguments both constructers.
      // we can also initialise without arguments bcoz we have also created default constructer.
        car c4 = new car();
        c4.name = "buggati";
        c4.print();
    }
}
