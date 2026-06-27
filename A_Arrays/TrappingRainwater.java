// to find trapped water :- area of trapped water = (waterlevel - height) * width (width is 1 in this case)
// waterlevel = min(rightmax array , leftmax array)

public class TrappingRainwater {
    public static int trapwater(int height[]){
         int n = height.length;

        // calculating rightmax bound  - array(auxilary or helping array)
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i = 1; i < n ; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calculating rightmax bound  - array 
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        
        int trappedwater = 0;
        // loop
        for(int i = 0 ; i < n ; i++){
            // waterlevel = min(max leftbound, max rightbound)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            // trappedwater = waterlevel - height[i]  
             trappedwater += waterlevel - height[i];
            }
            return trappedwater;
    }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapwater(height));
    }
   
}
