// [5,1,2,3,4] - unsorted array
// [1,2,3,4,5] - sorted array in assending order
// [5,4,3,2,1] - sorted array in descending order

// its time complexity is O(n^2) for worst case , which is not optimal  but after adding swap
// method we can decrease the time complexity , for best case time complexity is O(n).

public class Bubble_sort {
    public static void compare (int num[]){
        int swap = 0 ;      // for best case it reduces time complexity
        for(int turns = 0 ; turns<num.length-1;turns++){
            for(int j = 0 ; j < num.length-1-turns; j++){
                if(num[j] > num[j+1]){
                    // swap
                    int temp = num[j];
                    num [j] = num[j+1];
                    num[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0 ) break;           // if array is sorted
        }
    }
    public static void printnum(int num[]) {
      for(int i = 0 ; i < num.length ; i++)  {
        System.out.print(num[i] + " ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {5,4,1,2,3};
        compare(num);
        printnum(num);
    }
}
