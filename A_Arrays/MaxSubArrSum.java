public class MaxSubArrSum {
    public static void maxSum(int num[]){
        int currVal = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< num.length ; i++){
            for(int j = i ; j< num.length ;j++){
             currVal = 0 ;
                for(int k = i ; k <= j ; k++ ){
                    currVal += num [k];
                }
                System.out.println(currVal);
                if(currVal>maxSum){
                    maxSum = currVal ;
                }
            }
        }
        System.out.println("max of subArray is : " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSum(num);
    }
}
