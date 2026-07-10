// delete a node from a linked list
import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
    Node(int val,Node next){
    this.val=val;
    this.next=next;
    }
}

class DeleteNode{
    public static void main(String args[]){
        Node n3=new Node(3,null);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);
        Node current=head;
        Node prev=null;
        System.out.println("before deletion of the linked list");
        while(current!=null){
            System.out.print(current.val+" ->");
            current=current.next;
            
        }
        System.out.println("null");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value which one you want to delete");
        int value=sc.nextInt();
        sc.close();
        if(head==null){
            System.out.println("no node present");
        }
        current=head;
        boolean found = false;
        if(head.val==value){
            head = head.next;
            found = true;
        }
        else{
        while(current!=null){
            if(current.val==value)
            {
                prev.next=current.next;
                found=true;
                break;
            }
            prev=current;
            current=current.next;
         }
        }
        
        if (!found) {
            System.out.println("Value does not exist.");
        }
        System.out.println("after deleting the node ");
        current=head;
        while(current!=null){
            
            System.out.print(current.val+"->");
            current=current.next;
        }
       
    System.out.println("null");
    }
    
}
