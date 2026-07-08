// insert at front 
class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val=val;
        this.next=next;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
    
}
public class Main{
public static Node insertFront(Node head, Node neww){
    if(head==null){
        System.out.println("no list present");
        return neww;
    }
    else{
        neww.next=head;
        return neww;
        
    }
    
}
   public static void main(String []args){
    Node n3=new Node(30);
    Node n2=new Node(20, n3);
    Node head=new Node(10,n2);
    Node neww=new Node(5);
    Node newhead=insertFront(head,neww);
    
    Node current = newhead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
  }
}
