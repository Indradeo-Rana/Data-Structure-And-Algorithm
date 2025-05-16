public class Jan22 {
    

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlists{
        Node head=null;
        Node tail=null;
        void insert(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }

        // dis
        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    // NOTHER LIST
    public static class Linkedl{
        Node head=null;
        Node tail=null;
        void insertEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    // static Node addTwoLists(Node num1, Node num2) {
        // code here
    public static void main(String[] args) {
        Linkedlists ll = new Linkedlists();
        ll.insert(1);
        ll.insert(2);
        ll.insert(5);
        ll.Display();
        System.out.println();
        Linkedl ln=new Linkedl();
        ln.insertEnd(2);
        ln.insertEnd(5);
        ln.Display();
        
    }
}
