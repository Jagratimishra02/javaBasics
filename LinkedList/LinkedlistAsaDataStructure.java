// Linked list as a data structure .
package LinkedList;
class node{
    int val;
    node next;            // default value is null
    node(int val){
        this.val = val;
    }
} 
class linkedlist{
     node head;         //null
     node tail;         //null
     int size;
      void addattail(int  val){     // time complexity = O(n) , space complexity = O(n).
        node temp = new node(val);
        if(tail == null) head= tail=temp;
        else{
           tail.next = temp;
           tail = temp;  
        }
        size++;
     }
     void addathead(int val){    // time complexity = O(n) , space complexity = O(n).
      node temp = new node(val);
      if(head == null) head = tail = temp;
      else{
        temp.next = head;
        head = temp;
       }
       size++;
     }
     void display(){      // time complexity = O(n) , space complexity = O(n).
      node temp = head;
      if(head == null) return ;
      while(temp != null){
         System.out.print(temp.val + " ");
         temp = temp.next;
      }
      System.out.println();
     }
    void deleteathead(){       // time complexity = O(n) , space complexity = O(n).
      if(head == null) {
         System.out.println("Array is empty");
         return ;
      }else{
       node temp = head;
       head = temp.next;
       if(temp == null)  tail = null;
      }
      size--;
    }
}
public class LinkedlistAsaDataStructure {
  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.addattail(2);
    ll.addattail(10);
    ll.addattail(20);
    ll.addattail(50);
    ll.addattail(60);
    ll.display();
    ll.addathead(22); ll.display();
    ll.addattail(2); ll.display();
    ll.deleteathead(); ll.display();
  }  
}
