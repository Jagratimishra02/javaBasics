public class RelationalOperator {

    public static void main(String[] args) {
        int A = 10 ;
        int B = 5;
        int C = 10;
        System.out.println(A==B);                     // 1 . equal to ==
        System.out.println(A==C);
        System.out.println(A==C && C==B);


        System.out.println(A != B);                   // 2. not equalto (inequality)

        System.out.println(A < B);                    // 3. less than

        System.out.println(A > B);                    // 4. greater than

        System.out.println(A <= B);                   // 5. lessthan or equal to

        System.out.println(A >= B);                   // 6. greaterthan or equalto
    }
}