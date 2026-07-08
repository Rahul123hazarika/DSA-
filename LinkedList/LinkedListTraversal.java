// linked list traversal
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }
}
public class LinkedListTraversal{
    public static void traversal(Node head){
        Node current =head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
            
        }
        System.out.println("null");
    }
    

public static void main(String args[]){
    Node node3=new Node(30);
    Node node2=new Node(20, node3);
    Node head=new Node(10,node2);
    System.out.println("Traversing the linked list");
    
    traversal(head);
}
}
