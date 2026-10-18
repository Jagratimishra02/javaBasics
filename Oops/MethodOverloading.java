// Methods overloading : methods having same name but different parameters .

public class MethodOverloading {
    public static int Max(int a,int b){
        return Math.max(a,b);
    }
    //Max of three numbers 
    public static int Max(int a,int b,int c){
        return Math.max(a,Math.max(b,c)); 
    }
    public static void main(String[] args) {
        System.out.println(Max(6, 8));  //  this will pass the values in method having two variables
        System.out.println(Max(2, 9, 8));  //  this will pass the values in method having three variables
    }
}
