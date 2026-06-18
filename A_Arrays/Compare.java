// to find largest or smallest ; for smallest intialize with (+ infinity), for smallestb initialise with (- infinity)
public class Compare {
    public static int largest(int numbers[]){
        int largeNum = Integer.MIN_VALUE;
        int smallNum = Integer.MAX_VALUE;
        for(int i = 0 ; i < numbers.length ; i++){
            if(largeNum < numbers[i]){
            largeNum = numbers[i];
            }
            if(smallNum > numbers[i]){
                smallNum = numbers[i];
                System.out.println("Smallest among array is "+smallNum);   // smallest find
            }
        }
        return largeNum; 
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest among the array is " + largest(numbers));  // largest find
    }
}
