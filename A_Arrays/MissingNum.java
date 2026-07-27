import java.util.Scanner;

public class MissingNum {
    public static void missingnum(int Arr[]){
        int n = Arr.length+1;
        int sum = n *(n+1)/2 ;
        int summissing = 0 ;
        for(int i : Arr){
            summissing += i;
        }
        System.out.println(sum-summissing);
    }
    public static void printArr(int Arr[]){
        for(int val : Arr){
            System.out.print(val + " ");
        }
        System.out.println();
      
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // to take input of length
    int index = sc.nextInt();
    int []Arr = new int[index];
    // to take input of elements
      int i = 0;
        while(i< index ){
           Arr[i] = sc.nextInt();
            i++;
        }
    printArr(Arr); 
    missingnum(Arr);
    }
}
