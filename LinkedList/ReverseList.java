package LinkedList;

public class ReverseList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void reverse(Node head){
        if(head==null) return ;
        reverse(head.next);
        System.out.print(head.data+" ");
    }

    public static void main(String[] args) {
        Node a= new Node(4);
        Node s= new Node(3);
        Node g= new Node(2);
        Node d= new Node(1);
        a.next=s;
        s.next=g;
        g.next=d;
        reverse(a);
    }
}
