package LinkedList.Leetcode;

public class IntersectionOfLists {
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println(" null");
    }

    public static void intersection(Node HeadA,Node headB){
        int lenA=0;
        Node tempA=HeadA;
        while (tempA!=null) {
            lenA++;
            tempA=tempA.next;
        }
        int lenB=0;
        Node tempB=headB;
        while (tempB!=null) {
            lenB++;
            tempB=tempB.next;
        }
        tempA=HeadA;
        for(int i=1;i<lenA-lenB;i++){
            tempA=tempA.next;
        }
        // tempA=HeadA;
        tempB=headB;
        while (tempA.data!=tempB.data) {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        System.out.println(tempA.data);
        // System.out.println(tempB.data);
    }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d= new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        Node h = new Node(45);
        Node i = new Node(65);
        Node j = new Node(50);
        Node k = new Node(60);
        Node l = new Node(70);
        h.next=i;
        i.next=j;
        j.next=k;
        k.next=l;
        display(a);
        display(h);
        intersection(a,h);
    }
}
