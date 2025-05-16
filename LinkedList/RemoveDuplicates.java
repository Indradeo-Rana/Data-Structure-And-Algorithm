package LinkedList;

public class RemoveDuplicates {
    public static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static void display( Node head){
        Node temp=head;
        System.out.print("haed->");
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("-> null");

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(3);
        Node f=new Node(5);
        Node g=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        Remove(a);
        display(a);
    }
    public static void Remove(Node head) {
        Node temp=head;
        while (temp!=null) {
            while (temp.data!=temp.next.data) {
                temp=temp.next;
            }
        }
    }
}
