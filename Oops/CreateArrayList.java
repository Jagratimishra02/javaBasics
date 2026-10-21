class ArrList{
    int [] arr; 
    int idx = 0;
    int size = 0;
    ArrList(int capacity){
        arr = new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    void capacityincrease(){           // if element is added more then its capacity then capacity increases
        int []arr2 = new int[2*arr.length];
        for(int i = 0 ; i < size ;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    void removeFromEnd(){      // to remove from end
        idx--; 
        size--;
        }
    void remove (int idx){                   // to remove elements
        if(idx == arr.length) removeFromEnd();
        for(int i = idx ; i < size-1 ;i++){
            arr[i] = arr[idx+1];
        } 
        size--;      
     }
    void insert(int num,int idx){
        if (size == arr.length){
            capacityincrease();
        }
        for(int i = size; idx < i ;i--){
            arr[i] = arr[i-1];
        } 
        arr[idx] = num;
        size++;      
     }
    void add(int ele){
        if(idx == arr.length) {
            capacityincrease();
        }
        arr[idx++] = ele;
        size++;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index , int num){
         arr[index] = num;
    }
    void display(){
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class CreateArrayList {
     public static void main(String[] args) {
        ArrList Arr1 = new ArrList(3);
        Arr1.add(10); Arr1.add(20);Arr1.add(30);Arr1.add(80);Arr1.add(59);
        Arr1.remove(4); Arr1.remove(1);
        Arr1.insert(22,1);
        Arr1.display();
        Arr1.capacity();
        System.out.println(Arr1.get(1));
     }
}
