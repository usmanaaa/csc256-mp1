import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue;

    public Queue() {
        this.queue = new LinkedList<Integer>();
    }

    public void enqueue(int val) {
        this.queue.add(val);
    }

    public int dequeue() {
        return this.queue.poll();
    }

    public int peek() {
        return this.queue.peek();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());

    }
}
