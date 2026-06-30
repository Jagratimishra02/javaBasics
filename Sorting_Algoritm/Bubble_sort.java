// [5,1,2,3,4] - unsorted array
// [1,2,3,4,5] - sorted array in assending order
// [5,4,3,2,1] - sorted array in descending order
public class Bubble_sort {
    public static void compare (int num[]){
        for(int turns = 0 ; turns<num.length-1;turns++){
            for(int j = 0 ; j < num.length-1-turns; j++){
                if(num[j] > num[j+1]){
                    // swap
                    int temp = num[j];
                    num [j] = num[j+1];
                    num[j+1] = temp;
                }
            }
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
