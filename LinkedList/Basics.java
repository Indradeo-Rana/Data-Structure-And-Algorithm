package LinkedList;

public class Basics {
    // creating function to display
    public static void Display(Node head){
        Node temp=head;
        System.out.print("head ->");
        while (temp!=null) {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
      
    }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data=data;
        }
    }

    // function to insert end
    public static void insert(Node head , int data){
        Node temp= new Node(data);
        Node t= head;
        while (t.next!=null) {
            t=t.next;
        }
        t.next=temp;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        // System.out.println(a);
        Node b = new Node(8);
        Node c = new Node(12);
        Node d = new Node(9);
        Node e = new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // Node temp=a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        // while (temp!=null) {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
Display(a);
        insert(a, 20);
        // calling display method
        Display(a);
    }
}
