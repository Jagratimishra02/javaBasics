public class Findtar {
    public static void main(String[] args) {
        int []arr = {8,7,2,6,3,4,23,22,5};
        int taget = 2;
        System.out.println(tar(arr,taget,0));
    }
    public static boolean tar(int []arr,int target,int idx){
       if (idx == arr.length) return false;
       if (arr[idx] == target) return true;
       return tar(arr, target, idx+1);
    }
}
