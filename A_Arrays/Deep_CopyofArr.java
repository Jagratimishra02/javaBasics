import java.util.Arrays;

public class Deep_CopyofArr {
    public static void main(String[] args) {
         int []arr = { 1, 4 , 6, 7, 8 };
         int []x = Arrays.copyOf(arr, arr.length); 
         x[0] = 9;
         System.out.println(arr[0]);
         System.out.println(x[0]);
    }
}
