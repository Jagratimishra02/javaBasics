// count and Say / Look and say 
// 1      
// 11   read it as // two 1
// 21
// 1211
// 111221
// 312211

public class LookndSayPatten {
    public static void main(String[] args) {
        System.out.println(pattern(1));
        System.out.println(pattern(2));
        System.out.println(pattern(3));
        System.out.println(pattern(4));
        System.out.println(pattern(5));
        System.out.println(pattern(6));
    }
    
    // Method 1 using String ans recursion 
    // private static String pattern(int n) {
    //     if(n==1) return "1";
    //     String s = pattern(n-1);
    //     String ans = "";
    //     int i = 0 ;
    //     int j = 0;
    //     while(j < s.length()){
    //         if(s.charAt(i) == s.charAt(j)) {
    //             j++;
    //         } else {
    //            int freq = j-i;
    //            ans += freq;
    //            ans += s.charAt(i);
    //            i = j ;
    //            }
    //       }  
    //      int freq = j-i;
    //      ans += freq;
    //      ans += s.charAt(i);
    //     return ans;
    // }

    // method 2 using stringbuilder
    private static String pattern(int n) {
        if(n==1) return "1";
        String s = pattern(n-1);
        StringBuilder ans = new StringBuilder();
        int i = 0 ;
        int j = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
               int freq = j-i;
              ans.append(j-1).append(i);
               i = j ;
               }
          }  
         int freq = j-i;
         ans.append(j-1).append(s.charAt(i));
        return ans.toString();
    }
}
