import java.util.*;
import java.util.LinkedList;
public class deque {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        // 2 1 3 4
        System.out.println(deque);
        deque.removeLast();
        // 2 1 3
        System.out.println(deque);

        System.out.println("First element = "+deque.getFirst());
        System.out.println("Last element = "+deque.getLast());

    }
}
