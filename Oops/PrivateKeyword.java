 class student{
        String name;
        double cgpa;
        private int rno;
        void print(){          // getter: here roll num can be accessed
            System.out.println(name + " " + rno + " " + cgpa);
        }
        int getrno(){          // getter: here roll num can be accessed
            return rno;
        }
        void setrno( int x){          // setter: here roll num can be set
            rno = x;
        }
    }
public class PrivateKeyword {
   
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "krapansh";
        // s1.rno = 96;  // it is private so not accesable
        s1.cgpa = 7.5;
        
        s1.setrno(28); 
        s1.print(); // here roll number can be accesed
    }
}
