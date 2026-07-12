public class ApSeries2 {
    public static void main(String[] args) {
        int count = 0;   // to count number of terms 
        for (int i = 99 ; i > 0 ; i -= 4){
            System.out.print(i + " ");
            count ++ ;
        }
        System.out.println();
        System.out.println("number of terms in the series : " + count);
    }
}
