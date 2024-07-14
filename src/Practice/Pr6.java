package Practice;


import java.util.ArrayList;
import java.util.List;

class CircularQueue{
    List<Integer> queue = new ArrayList<>();

    public void enqueue(int num) {
        queue.add(num);
    }

    public int dequeue() {
        int ret = queue.get(0);
        queue.remove(0);
        return ret;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
public class Pr6 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        queue.enqueue(30);
        System.out.println(queue.isEmpty());
    }
}
