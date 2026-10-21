// Inheritance means a child class which inherits from the parent class
//  and can access parent class

class vehicle{           // parent of powervehicles
    int wheels;
    int speed;
    int seats;
}
class powervehicles extends vehicle{      // parent of aircrafts 
    int engine;
}
class aircrafts extends powervehicles{
    int rotors;
}
public class Inheritance {
    public static void main(String[] args) {
        vehicle cycles = new vehicle();
        cycles.speed = 29; cycles.seats = 2 ; cycles.wheels = 2;
        // cycles.engine = 3 ;   // cannot be accessed parent class can't access child 

        aircrafts helicopter = new aircrafts();
        helicopter.engine = 4 ;
        helicopter.rotors = 2 ;
        helicopter.seats = 4 ;  // it can access parent class .
    }
}

// if a child has multiple parent it is known as multiple inheritance
//  Hybrid inheritance is a mix of two or more inheritance types, such as single and
//  multiple inheritance combined
//  Java does not support multiple or hybrid inheritance using classes to avoid
//  ambiguity and complexity. However, Java allows you to achieve both multiple and 
// hybrid inheritance behaviors using interfaces
