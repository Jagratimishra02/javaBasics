// Class is a blueprint  And object is a real life entity.
import java.util.Scanner;

public class objectNdClass {
    public static class student{         // CLASS
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);    // scanner is a class , sc is an object
    student s1 = new student();     // object s1 declaration
    s1.name = "jagrati";
    s1.rno = 28;
    s1.cgpa = 7.1;

    student s2 = new student();
    s2.name = "nishi";
    s2.rno = 2;
    s2.cgpa = 7.5;

    student s3 = new student();
    s3.name = "krapansh";
    s3.rno = sc.nextInt();
    s3.cgpa = 8.5;

    System.out.println(s1.name +" " + s1.cgpa +" "+ s1.rno);
    s2.cgpa = 9.1;
    System.out.println(s2.cgpa);
    System.out.println(s3.rno);
    }
}
