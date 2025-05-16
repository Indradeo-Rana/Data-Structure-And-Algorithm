public class Jan20 {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node mergeSortedLinkedList(Node head1, Node head2){
        Node temp = new Node(0);
        Node current = temp;
        while (head1 != null && head2 !=null) {
            if(head1.data< head2.data){
                current.next=head1;
                head1=head1.next;
            }
            else{
                current.next=head2;
                head2=head2.next;
            }
            current=current.next;
        }
        if(head1!= null){
            current.next=head1;
        }else{
            current.next=head2;
        }

        return temp.next;
    }

    // Display method 
    public static void printlist( Node mergeHead){
        Node temp=mergeHead;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head1= new Node(1);
        head1.next=new Node(3);
        head1.next = new Node(5);
        head1.next=new Node(9);

        Node head2=  new Node(2);
        
        head2.next = new Node(7);

        //  calling the function
        Node mergeHead = mergeSortedLinkedList(head1, head2);

        // printing the list
        printlist(mergeHead);
    }
}
