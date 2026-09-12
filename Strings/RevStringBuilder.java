public class RevStringBuilder {
    public static void main(String[] args) {
        String n = "nishi";
        // To reverse string using stringbuilder 
        StringBuilder m = new StringBuilder(n);

        // j.reverse();            // inbuild function 
        int i = 0  , j = m.length()-1; 
        while(i<j){
            char temp1 = m.charAt(i);
            char temp2 = m.charAt(j);
            m.setCharAt(i, temp2);
            m.setCharAt(j, temp1);
            i++;
            j--;
        }

        System.out.println(m); // string reversed
    }
}
