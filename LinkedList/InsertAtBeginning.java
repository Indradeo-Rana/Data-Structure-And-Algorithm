package LinkedList;

public class InsertAtBeginning {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head= null;
        Node tail=null;
        void InsertAtFirst(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
        }
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
           }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.InsertAtFirst(8);
        ll.display();
        ll.InsertAtFirst(1);
        ll.display();
    }
}
