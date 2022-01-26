package Stack;

public class Stack {
    LinkedList stack;

    public Stack() {
        this.stack = new LinkedList(-1);
    }

    public void push(int val) {
        this.stack = this.stack.prepend(val);
    }

    public int pop() {
        int val = this.stack.getVal();
        this.stack = this.stack.next;
        return val;
    }

    public int peek() {
        return this.stack.getVal();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.peek());

    }
}
