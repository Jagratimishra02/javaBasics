class Pokemon{        // user defined datatype (new class created)
    private int power;                  // here it is accessable inside the class only .
    String type;
    // new method created to access power .
    int getpower(){
        return power;                 // getter
    } 
    int getpower(int power){
        return this.power= power;    // setter
    }
    // constructers
    Pokemon(){     // default constructer
    }
    Pokemon(int power , String type){   
        this.power = power;      // setter for power as power is private
        this.type = type;
    }
    Pokemon(String type , int power){   
        this.power = power;
        this.type = type;
    }
    void print(){
        System.out.println(this.type + " " + this.power);
    }
}
public class RevisionOops {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("electric" , 70);
        pikachu.type = "fire";
        // pikachu.power() = 60;  // error bcoz power is private.
        pikachu.getpower(55);    // using setter method power updated. 
        pikachu.print(); 

        Pokemon jigglypuff = new Pokemon( 50 , "fairy");
        // System.out.println(jigglypuff.power()); error bcoz power is private .
        System.out.println(jigglypuff.getpower());  // we can print by using methods

        jigglypuff.print();
    }
}
