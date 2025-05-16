package LinkedList.Leetcode;

public class FindNthNode {
    // display method 
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println(" null");
    }
    // getNode(a,2)
    public static Node getNode(Node head,int x){
        Node temp=head;
        int cnt=0;
        while (temp!=null) {
            cnt++;
            temp=temp.next;
        }
        int n=cnt-x;
       Node temp1=head;
        for(int i=1;i<=n;i++){
            temp1=temp1.next;
        }
        return temp1;
    }
    // Another method 
    public static Node getNode2(Node head,int idx){
        Node slow=head,fast=head;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    //  DELETE Nth  FROM  Linkedlist
    public static Node delete(Node head,int pos){
        
        Node slow=head, fast=head;
    
        for(int i=1;i<=pos;i++ ){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        } 
    }
    public static void main(String[] args) {

        Node a = new Node(12);
        Node b = new Node(25);
        Node c = new Node(98);
        Node d = new Node(45);
        Node e = new Node(32);
        Node f = new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // Node ans=getNode(a,3);  // a=head of the linked list and 2 is position fron end
        // System.out.println(ans.data);
        // Node ans1=getNode2(a,1);  // by one traversal
        // System.out.println(ans1.data);
        // delete Nth term from link list
        display(a);
        Node q=delete(a,6);
        display(q);
    }
}
