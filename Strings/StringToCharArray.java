public class StringToCharArray {
    public static void main(String[] args) {
        String s = "jagrati";
        char [] arr = s.toCharArray();

        // it gives char array
        for( char ele: arr){
            System.out.print(ele);
        } 
        System.out.println();

        // it gives int array
        for( int ele: arr){
            System.out.print(ele + " ");
        }


        // Camel case = thisIsCamelCase
        // pascal case = ThisIsPascalCase
    }
}
