// anagram means two words having same char in it even if it jumbled.
import java.util.Arrays;
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        // if length of s is not equal to t return false 
        if(s.length() != t.length()) return false;

        // change string into char array
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        // sort the string 
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // check elemts of array is equal or not 
        for(int i = 0 ; i < arr1.length;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        String x = "a";
        String y = "jago";
        System.out.println(isAnagram(x, y));
    }
}
