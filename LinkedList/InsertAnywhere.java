package LinkedList;

public class InsertAnywhere {
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
        // inserting at last
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }

        // inserting at beginning
        void insertAtStarting(int data){
            Node temp = new Node(data);
            if(head==null){
                 insertAtEnd(data);
                // head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
        }

        // inserting at middle
        void insertAtMiddle(int idx, int data){
            Node t= new Node(data);
            Node temp =head;
            // tail ki data update ho jayega
            if(idx == size()){
                insertAtEnd(data);
                return;
            }
            // it will add the list at 0th index 
            else if(idx==0){
                insertAtStarting(data);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Invalid index entetred");
                return; 
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
           temp.next=t;
        }
        // deleting the element
        void delete(int ind){
            Node temp =head;
            // if we have to delete the first element
            if(ind==0){
                head=head.next;
                return;
            }
            for(int i=0;i<=ind-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
        // displaying
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
        // finding the size of the list
        int size(){
            Node temp=head;
            int cnt=0;
            while (temp!=null) {
                cnt++;
                temp=temp.next;
            }
            return cnt;
        }
        // this function will returnindex of that element of int type  
        int getAt(int k){
            Node temp=head;
            // int cnt=0;
            // int ans=-1;
            // while (temp!=null) {
            //     if(k==cnt){
            //         ans= temp.data;
            //     }
            //     cnt++;
            //     temp=temp.next;
            // }
            // return ans;
            for(int i=1;i<=k;i++){
                temp=temp.next;
            }
            return temp.data;
        }

    }
    public static void main(String[] args) {
        Linkedlists ll= new Linkedlists();
        ll.insertAtEnd(8);
        ll.insertAtEnd(8);
        ll.insertAtEnd(8);
        // ll.display();
        ll.insertAtStarting(5);
        // ll.display();
        ll.insertAtMiddle(1,6);
        // if we add at last it will work but tail will not be updated to last list
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);
        ll.display();
        ll.size(); // => this will give the size of the list
        System.out.println("this will return ele of given list");
        System.out.println(ll.getAt(3));
        ll.delete(0);
        ll.display();
    }
}
