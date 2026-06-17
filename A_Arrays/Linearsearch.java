// linear search

//Time complexity of linearsearch is O(n). bcoz for worst case it goes from o to n

public class Linearsearch {
   public static int linearsearch(int numbers[],int key){
     // search
        for(int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] == key) {
                return i;
            } 
        }                      // if key not found in a loop then return -1
        return -1;
   }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,16};
        int key = 10;

        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key is at index: " + index);
        }

    }
}
