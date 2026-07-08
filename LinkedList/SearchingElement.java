// search an elements that element is inside a linkedlist or not ?  
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    Node (int val, Node next){
        this.val=val;
        this.next=next;
    }
}

public class SearchingElement{
    public static boolean search(Node head, int target){
        Node current=head;
        while(current!=null){
            if(current.val==target){

                return true; 
            }
            else{
                current=current.next;
            }

        
        }
        return false;
    }
    public static void main(String args[]){
        Node n3=new Node(40);
        Node n2=new Node(30,n3);
        Node head=new Node(20,n2);
        boolean result=search(head,40); 
        System.out.println("is target value found ? "+result);
    }
}
