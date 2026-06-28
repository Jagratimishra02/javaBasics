/* ques1 : Given an integer array nums, return true if any value appears atleast twice in the array, and return false
if every element is unique */
// brute force - time complexity = O(n^2)

public class ArrayQuestion1 {
    public static boolean repeatednum(int num[]){
        boolean found = false;
        for(int i = 0 ; i < num.length-1 ; i++){                // for i = 0,1,2  
            for( int j = i + 1 ; j < num.length ; j++){           // for j = 1,2,3
                if (num[i] == num[j]) {
                    // System.out.print("number repeated is " + num[i]);
                    found = true;
                    // return true ;
                    break ;
                }

            }
        }
        return found ;
    }
    public static void main(String[] args) {
        // int num[] = {1,2,3,1};
        int num[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(repeatednum(num));
    }
}
