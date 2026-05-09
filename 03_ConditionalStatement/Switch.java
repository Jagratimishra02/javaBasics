public class Switch {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch) {
            case 'b':
                System.out.println("samosa");
                break;
            case 'a':   
                 System.out.println("burger");  
                break;
            case 'c':   
                 System.out.println("pasta");  
                break;

            default: System.out.println("wake up");
                break;
        }

    }
}
