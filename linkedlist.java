
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linked {

    // Insert at front
    Node insertFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head; // new node points to old head
        return newNode;      // new node becomes the new head
    }

    // Insert at end
    Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // if list empty
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Delete from front
    Node deleteFront(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        return head.next; // skip the first node
    }

    // Delete last
    Node deleteLast(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if (head.next == null) { // only 1 node
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Delete by position
    Node deleteByPos(Node head, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return head;
        }
        if (pos == 1) {
            if (head == null) {
                System.out.println("List is already empty");
                return null;
            }
            return head.next; // remove first node
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return head;
        }
        System.out.println("Deleted data is " + temp.next.data);
        temp.next = temp.next.next;
        return head;
    }

    // Display list
    void display(Node head) {
        if (head == null) {
            System.out.println("Nothing to display");
            return;
        }
        System.out.print("The linked list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String []args){
        linked list =new linked();
        Node head=null;
      
        head = list.insertEnd(head, 10);
        head = list.insertEnd(head, 20);
        head = list.insertEnd(head, 30);
        head = list.insertEnd(head, 40);

        list.display(head);
        head = list.deleteByPos(head, 3);
        list.display(head);

        head = list.deleteFront(head);
        list.display(head);

        head = list.deleteLast(head);
        list.display(head);

    }
}
