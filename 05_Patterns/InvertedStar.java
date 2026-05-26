// inverted star question
public class InvertedStar {
    public static void main(String[] args) {
        for(int line = 1; line<=4; line++){
            // for(int star = 4; star>=line; star--){
            //     System.out.print("*");
            // }
            // System.out.println();

            // method 2
               for(int star =1; star <= 4-line+1;star++){
                System.out.print("*");
               }

            System.out.println();
        }
    }
}
