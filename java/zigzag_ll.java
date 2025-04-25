public class zigzag_ll {
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

    public void zigzag() {
        //find mid node
        Node mid = getMid(head);

        //reverse the second half of the linked list
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternate merging
        Node left = head; //left head
        Node right = prev;
        Node nextL, nextR; //next left and next right

        while(left!=null && right!=null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
        }
    }
    
    public static void main(String args[]) {
        zigzag_ll ll = new zigzag_ll();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        ll.zigzag();
        ll.print();
    }
}
