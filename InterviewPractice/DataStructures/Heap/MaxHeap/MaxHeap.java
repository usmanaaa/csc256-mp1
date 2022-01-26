import javax.swing.text.StyledEditorKit.BoldAction;

public class MaxHeap {
    int heapSize;
    int[] heap;

    public MaxHeap(int capacity) {
        this.heapSize = 0;
        this.heap = new int[capacity];
    }

    public boolean isFull() {
        return this.heapSize == this.heap.length;
    }

    public int parentIndex(int i) {
        return (i - 1) / 2;
    }

    public void insert(int val) {
        if (!isFull()) {
            this.heap[heapSize++] = val;
            heapifyUp(this.heapSize - 1);
        }
    }

    public void heapifyUp(int i) {
        int temp = heap[i];
        while (i > 0 && temp > heap[parentIndex(i)]) {
            heap[i] = heap[parentIndex(i)];
            i = parentIndex(i);
        }
        heap[i] = temp;
    }

    public void print() {
        for (int i : heap) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(3);
        heap.insert(5);
        heap.insert(2);
        heap.insert(4);
        heap.insert(10);
        heap.insert(15);

        heap.print();

    }

}
