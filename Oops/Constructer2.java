public class Constructer2 {
    public static class student{
        String name ;
        int rno;
        int[] marks;
        student(int s){
            marks = new int[s];   // s  is length of array 
        }
        student(int []a){
            marks = a;   
    }
  }
    public static void main(String[] args) {
        student s1 = new student(2);

        int []arr = {2,4,6,8};
        student s2 = new student(arr);
        s2.marks[0] = 20;   // we can modify array as it is a shallow copy .
        System.out.println(s2.marks[0]);
    }
}
