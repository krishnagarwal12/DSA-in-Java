public class detecting_cycle {
    
    // Make Node a static inner class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Floyd's Cycle-Finding Algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by 1
            fast = fast.next.next;      // Move fast pointer by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void removeCycle() {
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                cycle = true;
                break;
            }
        }
        if(cycle=false) { //if cycle doesn't exist
            return;
        }
        //if cycle exists
        //find the last node
        slow = head;
        Node prev = null; 
        while(slow!=fast) {
            prev = fast; //last node
            slow = slow.next;
            fast = fast.next;
        }

        //last node ka next ko null krdo
        prev.next = null;
    }

    public static void main(String[] args) {
        // Initialize the linked list
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        // Detect cycle
        System.out.println("Cycle detected: " + isCycle());
        removeCycle();
        System.out.println("Cycle detected: "+isCycle());

    }
}

