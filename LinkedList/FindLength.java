package LinkedList;

public class FindLength {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void count(Node head){
         int cnt=0;
      Node temp=head;
      while (temp!=null) {
        cnt++;
        temp=temp.next;
      }
      System.out.println("cnt="+cnt);
    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(2);
        Node c=new Node(1);
        Node d=new Node(52);

        a.next=b;
        b.next=c;
        c.next=d;

        count(a);
    }
}
