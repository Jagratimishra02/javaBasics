public class ArrayQues3 {
    public static int waterlevel (int height[]){
        int n = height.length;
        // max left bound 
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // right max bound 
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0; i--){
            rightmax [i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        //loop 
        for (int i = 0 ; i < n ;i++){
            // waterlevel =  Math.min(right max, left max)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
             // watertrapped = waterlevel - height[i]* width (width is 1 so ignore width)
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(waterlevel(height));
        int height2[] = {4,2,0,3,2,5};
        System.out.println(waterlevel(height2));
    }
}
