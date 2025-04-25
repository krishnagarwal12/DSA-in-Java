public class mergeSort_ll {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if(head==null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if(head==null) {
            head = tail = newnode;
            return;
        }
        tail.next=newnode;
        tail = newnode;
    }

    public void print(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //for the remaining elements
        while(head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; //kyuki -1 nai chahiye
    }

    public Node mergeSort(Node head) {
        //base case
        if(head==null || head.next==null) {
            return head;
        }
        //step1: find the mid node
        Node mid = getMid(head);

        //step2: divide the ll in two halves and sort
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String args[]) {
        mergeSort_ll ll =new mergeSort_ll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
    
}
