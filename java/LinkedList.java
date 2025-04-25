public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        //step1 - create a new node
        Node newNode = new Node(data);
        size++;

        if(head==null) { //if linked list is empty
            head = tail = newNode;
            return;
        }
        
        //step2 - new node's next = head
        newNode.next = head; //this is our linking step

        //step3 - head = new node
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    public void add(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        //ab hamara i=idx-1 and temp = previous node
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1) {
            int val =head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //otherwise
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev = size-2;
        Node prev  = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next=null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;

        while(temp!=null) {
            if(temp.data==key) {
                return idx;
            }
            idx++;
            temp=temp.next;
        }

        //if key is not present
        return -1;
    }
    public int helper(Node head,int key) {
        if(head==null) {
            return -1;
        }
        if(head.data==key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1) {
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key) { //O(n)
        return helper(head,key);
    }
    public void reverse() {
        Node prev = null; //kyuki shuru mai head ke previous mai kuch nahi hoga
        Node curr = tail = head;
        Node next;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head  = prev;
    }

    public void deleteNthNodeFromEnd(int n) {
        //calculate size
        int sz=0;
        Node temp = head;
        while(temp!=null) {
            temp=temp.next;
            sz++;
        }

        //if nth node from last is the head node(1st node)from beginning
        if(n==sz){
            head=head.next;
            return;
        }
        
        int i=1;
        int iToFind = sz-n; //prev(jo node delete krna hai uske phele wala node)
        Node prev=head;
        while(i<iToFind) {
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
        
    } 

    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //slow is my mid
    }

    public boolean checkPalindrome() {
        if(head==null || head.next==null) {
            return true;
        }
        //step1: find mid node
        Node mid = findMid(head);

        //step2: reverse the 2nd half of the linked list
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step3: check if equal
        Node left=head;
        Node right=prev; //second half ka head
        while(right!=null) {
            if(left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
 
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        //ll.addLast(2);
        ll.addLast(1);
        //ll.add(2,9);

        ll.print();
        //System.out.println(ll.itrSearch(10));

        //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        //System.out.println(ll.recursiveSearch(4));
        //ll.reverse();
        //ll.deleteNthNodeFromEnd(2);
        // ll.print();
        System.out.println(ll.checkPalindrome());
    }
    
}
