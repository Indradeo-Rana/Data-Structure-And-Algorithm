public class Jan21 {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedClass{
        Node head=null;
        Node tail=null;
        // inserting 
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                
            }else{
                tail.next=temp;
            }
            tail=temp;
        }
        
        public Node reverseKGroup(Node head, int k) {
            if (head == null || k == 1) return head;
            
            Node dummy = new Node(0);
            dummy.next = head;
            Node prev = dummy, curr = dummy, nex = dummy;
            int len = getLength(head);
            
            while (len >= k) {
                curr = prev.next;
                nex = curr.next;
                for (int i = 1; i < k; i++) {
                    curr.next = nex.next;
                    nex.next = prev.next;
                    prev.next = nex;
                    nex = curr.next;
                }
                prev = curr;
                len -= k;
            }
            return dummy.next;
        }
        
        public static int getLength(Node head){
            int cnt=0;
            while(head!=null){
                cnt++;
                head=head.next;
            }
            return cnt;
        }
        // display    
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
               temp= temp.next;
            }
            System.out.println();
        }
        
        void reverseAndDisplay(int k) {
            head = reverseKGroup(head, k);
            display();
        }
    }

    public static void main(String[] args) {
        LinkedClass ll = new LinkedClass();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.display();

        System.out.println("Reversed in K-groups:");
        ll.reverseAndDisplay(4);
    }
}
