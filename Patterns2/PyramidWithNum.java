// inverted half pyramid with numbers
public class PyramidWithNum {
    public static void main(String[] args) {
       Inverted_nums_pyramid(5);
    }
    public static void Inverted_nums_pyramid(int n){
         // outer loop for rows 
        for(int i = 1 ; i <= n; i++){
            // for inner loop
            for(int j = 1 ; j <= (n+1)-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
