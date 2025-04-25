public class doubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if(head==null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if(head==null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public int removeFirst() {
        if(head==null) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val = head.data;
            size--;
            head=tail=null;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removeLast() {
        if(head==null) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val = head.data;
            size--;
            head = tail = null;
            return val;
        }
        //size>1
        Node temp = head;
        Node prev = head;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        int val = temp.data;
        size--;
        prev.next = null;
        temp.prev = null;
        tail = prev;
        return val;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        doubleLL dll = new doubleLL();
        
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addLast(0);

        dll.print();
        //System.out.println("Size = "+dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size = "+dll.size);
        // dll.removeLast();
        // dll.print();
        // System.out.println("Size = "+dll.size);

        dll.reverse();
        dll.print();


    }
}
