package LinkedList;

public class splitOE {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }

    public static void Display(Node head){
        Node temp=head;
        System.out.print("head ->");
        while (temp!=null) {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(12);
        Node d = new Node(9);
        Node e = new Node(16);
        Node f = new Node(1);
        Node g = new Node(5);
        Node h = new Node(18);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        Display(a);
        splitLinkedlist(a);
    }

    public static void splitLinkedlist(Node head){
        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        Node odd = oddHead;
        Node even = evenHead;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 != 0) {
                odd.next = new Node(temp.data);
                odd = odd.next;
            } else {
                even.next = new Node(temp.data);
                even = even.next;
            }
            temp = temp.next;
        }
        System.out.print("Odd List: ");
        // odd.next = evenHead.next;
        Display(oddHead.next);
        System.out.print("Even List: ");
        Display(evenHead.next);
    }
}
