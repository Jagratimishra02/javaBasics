// passing arrays as as argument . arrays are passed by refrence 
// Arrays are call by refernce - means the orignal value also changes in array 

public class One_Arr{
    public static void updateArr(int marks[], int nonchangeable){
         nonchangeable = 5;
        for(int i = 0 ; i < marks.length ; i++){   //marks.lenth = 3 , but we want index 0,1,2 so loop will run from i<marks.length
           marks[i] = marks[i]+1;
        } 
    }
    public static void main(String[] args) {
        int nonchangeable = 5;
        int marks[]= {96,97,98};
        updateArr(marks, nonchangeable);

        System.out.println("value of nonchangeable is :" + nonchangeable); 
          // it remains same bcoz its variable , array is call by refrence so changed

        // to print marks 

        for(int i = 0 ; i < marks.length ; i++){
            System.out.println("updated marks is " + marks[i]);
        }
    }
}
