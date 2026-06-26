// to find maximum sum of subarray using prefix method ... its time complexity is O(n^2) which is better than brut forth code 

public class PrefixSum {
    public static void sum(int num[]){
        int currsum = 0 ;
        int maxsum= Integer.MIN_VALUE;

        int prefix[] = new int[num.length];
        prefix[0]= num[0];
        // calculate prefix array 
        for(int i = 1;i< num.length ;i++){
            prefix[i] = prefix[i-1]+num[i]  ;
        }

        for(int i = 0; i< num.length; i++){
            int start = i;
            for(int j = i; j<num.length ; j++){
                int end = j;

                //++++++++++++++++ this loop increases the time complexity
                // for(int k = start ;k<= end ; k++){
                //     System.out.print(num[k]+" ");
                // }                              



        // to calculate sum
                currsum = start == 0 ?  prefix[end] : prefix[end]- prefix[start-1];
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum : " + maxsum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        sum(num);
    }
}
