// continue : - continue is used to skip an iteration 
// for example:-skip 3 and print from 0 to 5
public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
              if (i==3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
