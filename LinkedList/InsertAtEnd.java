package LinkedList;

public class InsertAtEnd {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
      
    public static class Linkedlist {
        //  data member 
        Node head=null;
        Node tail=null;

        // member functions
        void InsertLast(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }
        void InsertAnyPoint(int k, int data){
            Node t= new Node(data);
            Node temp=head;
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        // display
        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.InsertLast(5);
       ll.InsertLast(6);
       ll.InsertLast(1);
       ll.Display();
       ll.InsertAnyPoint(1,10);
       ll.Display();
    }
}
