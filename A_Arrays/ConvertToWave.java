public class ConvertToWave {
    public static void convert_into_wave(int arr[]){
        // for odd num arr i + 1 will be out bound so i < arr.length -1.
        for(int i = 0 ; i < arr.length- 1 ; i += 2)  {   
        // if(i == arr.length)  break ;   // use this if loop if from i < arr.length instead of arr.length-1
         int temp = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = temp;
        } 
    }
     public static void printarr(int arr[]){
        for( int value : arr){
            System.out.print(value + " " );
        }
        }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        convert_into_wave(arr);
        printarr(arr);
    }
}
