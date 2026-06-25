// subarrys is a continuous part of array.
public class SubArr {
    public static void sArray(int num[]){
        int ts = 0;    // total subarray
        for(int i = 0 ; i < num.length;i++){
            int start = i ;
            for(int j = i ; j < num.length ; j++){
             int end = j;
                for(int k = start ;k<= end ; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        sArray(num);
    }
}
