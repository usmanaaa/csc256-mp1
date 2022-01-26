package Stack;

class LinkedList {
    int val;
    public LinkedList next;

    LinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return this.val;
    }

    void add(int val) {
        LinkedList curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new LinkedList(val);
    }

    LinkedList prepend(int val) {
        LinkedList curr = this;
        LinkedList newHead = new LinkedList(val);
        newHead.next = curr;
        return newHead;
    }

    void print() {
        LinkedList curr = this;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
