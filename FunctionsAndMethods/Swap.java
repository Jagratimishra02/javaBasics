// call by value:- java always call by value. which means the changes takes place in the copy 
public class Swap {
    public static void Swap(int a, int b){
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is:" + a); // a = 5
        System.out.println("b is:" + b); // b = 20
    }
    public static void main(String[] args) {
        // swap-value exchange
        int a = 20;
        int b = 5;
        Swap(a, b);     // function call

        System.out.println(a);     // it has orignal value of a not swapped one bcoz swapping is done in the copy 
        System.out.println(b);
       
    }
}
