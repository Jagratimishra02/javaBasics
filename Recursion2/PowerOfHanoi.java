// TO move disks from a to c ."Power of Hanoi"
public class PowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,'a','b','c');
    }
    private static void hanoi(int n , char a , char b , char c) {
        // to move disks a to c 
        if(n == 0) return; // base case
       hanoi(n-1, a, c, b); // n-1 disks a to b via c
       System.out.println(a + "=>" + c); //largest from  a to c 
       hanoi(n-1, b, a, c); // n-1 disks from b to c via a
    }
}
