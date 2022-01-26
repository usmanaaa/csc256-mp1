class LinkedList {
    int val;
    LinkedList next;

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

    public static void main(String[] args) {
        LinkedList node = new LinkedList(1);

        node.add(2);
        node.add(3);
        node.add(98);
        // node.print();
        LinkedList pre = node.prepend(122);
        pre.print();

    }
}
