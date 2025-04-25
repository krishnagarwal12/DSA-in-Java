import java.util.*;
public class queue_using_2stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //yeh isEmpty function hum bana rhe h check krne ke liye ki hamara queue khaali h ya nai 
        //aur hum ultimately apna pura queue stack s1 mai store kr rhe h. Therefore sirf ussi ke liye check krenge

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add-O(n)
        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop()); //s1 ke element ko pop krke s2 mai push kr rhe h
            }
            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove-O(1)
        public static int remove() {
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        //peek-O(1)
        public static int peek() {
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
