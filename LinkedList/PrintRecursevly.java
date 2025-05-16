package LinkedList;

public class PrintRecursevly {
    
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    public static void displayRe(Node head){
        if(head==null) return;
        displayRe(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(55);
        a.next=b;
        b.next=c;
        c.next=d;
        
        displayRe(a);
    }
}
