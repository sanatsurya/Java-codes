package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        System.out.println(q1);
        //q1.poll();
        System.out.println(q1.poll());

    }
}
