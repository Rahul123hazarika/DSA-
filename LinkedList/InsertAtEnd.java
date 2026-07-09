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
public class InsertAtEnd{
    public static Node insertEnd(Node head, Node neww){
        if(head==null){
            return neww;
        }
        Node current=head;
        while(current.next!=null){
            
            current=current.next;
            
        }
        current.next=neww;
        return head;
        
            
    }
    public static void main(String args[]){
        Node n3=new Node(30,null);
        Node n2=new Node(20,n3);
        Node head=new Node(10, n2);
        Node neww=new Node(5);
        Node n=insertEnd(head,neww);
        Node current = n;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println(n);
    }
}
