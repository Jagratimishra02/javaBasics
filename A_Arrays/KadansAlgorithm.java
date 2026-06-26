// kadanes algorithm to find maximum sum of subarray ;  its time complexity is O(n), it is most prefferable approach ,better code

public class KadansAlgorithm {
    public static void kadanessum(int num[]){
        int currsum = 0 ;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i< num.length ;i++){
            currsum = currsum + num[i];
            maxsum = Math.max(maxsum, currsum);   // it will give max sum 
            if(currsum < 0){
                currsum = 0 ;
            }
            
        }
        System.out.println("maxsum is : " + maxsum);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanessum(num);

        // covers all negative cases
        int num2[] = { -1,-5,-6,-4,-2};
        kadanessum(num2);
    }
}
