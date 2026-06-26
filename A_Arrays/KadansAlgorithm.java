public class KadansAlgorithm {
    public static void kadanessum(int num[]){
        int currsum = 0 ;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i< num.length ;i++){
            currsum = currsum + num[i];
            if(currsum < 0){
                currsum = 0 ;
            }
            maxsum = Math.max(maxsum, currsum);   // it will give max sum 
        }
        System.out.println("maxsum is : " + maxsum);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanessum(num);
    }
}
