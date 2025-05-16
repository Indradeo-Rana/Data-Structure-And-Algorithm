package LinkedList.Leetcode;

public class DeleteGivenNode {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Linkedlists{
        Node head=null, tail=null;
        // inserting the list
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;

        }
        // deleting the given the node from the list
        void deleteNode(Node a){
            Node temp=a;
            temp.data=temp.next.data;
            temp.next=temp.next.next;
        }

        // displaying the list
        void display(){ 
            Node tem = head;
            while (tem!=null) {
                System.out.print(tem.data+" -> ");
                tem=tem.next;
            }
            System.out.println("null");
        }
       
    }

    public static void main(String[] args) {
        Linkedlists ll = new Linkedlists();
        ll.insertAtEnd(23);
        ll.insertAtEnd(83);
        ll.insertAtEnd(63);
        ll.insertAtEnd(38);
        ll.insertAtEnd(33);
        ll.display();
        
    }
}
