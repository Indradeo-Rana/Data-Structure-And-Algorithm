package LinkedList.Leetcode;

public class FindMiddleElement {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void findMid(Node head){
        Node slow=head;
        Node fast=head;
        while ( fast!=null && fast.next!=null ) { // fast.next.next se even number wala middle milega
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void deleteMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next.next!=null ) { // fast.next.next se even number wala middle milega
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(slow.data);
        slow.next=slow.next.next;
        
    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(129);
        Node c=new Node(142);
        Node d=new Node(612);
        Node e=new Node(512);
        Node f=new Node(102);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        // System.out.println();
        // findMid(a);
        deleteMid(a);
        
    }
}
