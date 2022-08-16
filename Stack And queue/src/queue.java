import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(3);
//        q.add(6);
//        q.add(15);
//        q.add(19);
//        q.add(1);
//
//        System.out.println(q.peek());
//        System.out.println(q.remove());


        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(4);
        dq.addFirst(4);
        dq.addLast(55);
    }
}
