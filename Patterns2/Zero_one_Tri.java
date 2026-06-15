// 0 , 1 triangle .
public class Zero_one_Tri {
    public static void main(String[] args) {
        zero_one_triange(5);
    }
    public static void zero_one_triange(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ;j++){
                if ((i+j)%2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            } System.out.println();
        }
    }
}
