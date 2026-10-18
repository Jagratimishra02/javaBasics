public class Constructer2 {
    public static class student{
        String name ;
        int rno;
        int[] marks;
        student(int s){
            marks = new int[s];   // s  is length of array 
        }
    }
    public static void main(String[] args) {
        student s1 = new student(2);
    }
}
