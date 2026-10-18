public class ThisKeyword {
    public static class car{
        int price;
        String name;
        double length;
        car(int price , String name){
            this.price = price;  //this.price refers to price of this class 
            this.name = name;
        }
        car(String s, int p ){
            price = p;
            name = s;
        }
        void print(){
            int price = 12;
            System.out.println(name + " "+ this.price);
            System.out.println(price);  // this refers to the var of this class not methods.
        }
    }
    public static void main(String[] args) {
        car c1 = new car("bmw", 400000000);
        c1.print();
        car c2 = new car(650000000 , "lambo");
        c2.print();
    }
}
