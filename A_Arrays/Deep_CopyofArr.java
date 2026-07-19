// deep copies means to create copy , for example ;- PRINTOUT Of a x paper is y (deep copy)
// shallow copy :- change the orignal x paper to name paper

import java.util.Arrays;

public class Deep_CopyofArr {
    public static void main(String[] args) {
         int []arr = { 1, 4 , 6, 7, 8 };
         int []x = Arrays.copyOf(arr, arr.length);  // deep copy created 
         x[0] = 9;                                  // change in deep copy 
         System.out.println(arr[0]);
         System.out.println(x[0]);
    }
}
