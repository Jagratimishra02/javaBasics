/* ques1 : Given an integer array nums, return true if any value appears atleast twice in the array, and return false
if every element is unique */
// brute force - time complexity = O(n^2)

public class ArrayQuestion1 {
    public static boolean repeatednum(int num[]){
        for(int i = 0 ; i < num.length-1 ; i++){                // for i = 0,1,2  
            for( int j = i + 1 ; j < num.length ; j++){           // for j = 1,2,3
                if (num[i] == num[j]) {
                    System.out.println("number repeated is " + num[i]);
                    return true ;
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        repeatednum(num);
    }
}
