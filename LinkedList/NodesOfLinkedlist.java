package LinkedList;
class node{
    int val;
    node next;         // default value is null
    node(int val){
        this.val = val;
    }
} 

public class NodesOfLinkedlist {
    public static void display(node head){
    // node temp = head ;
    // while(temp != null){
    //     System.out.print(temp.val);
    //     temp = temp.next;       // to update temp after every print
    // }
    // System.out.println();

    // by using for loop .
    for(node temp = head; temp != null ;temp = temp.next ){
        System.out.print(temp.val + " ");
    }
    System.out.println();
}
    // 10->20->30->40->50   linked list means next element (is connected)has address of previous one 
    public static void main(String[] args) {
        node a = new node(10);           // headnode
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        System.out.println(c.next);    // default null

        // link the elements (connection established)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a);   
         System.out.println(a.next);    // a.next = b
        System.out.println(b);  System.out.println(b.next);

        System.out.println(c);           //  c
        System.out.println(b.next);       // c
        System.out.println(a.next.next);  // c

        System.out.println(a.next.next.next.val);            // d.val = 40 
        display(a);
    }
}
