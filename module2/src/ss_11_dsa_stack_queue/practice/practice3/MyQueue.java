package ss_11_dsa_stack_queue.practice.practice3;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currenSizs = 0;

    public MyQueue(int currenSizs) {
        this.currenSizs = currenSizs;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currenSizs == capacity) {
            status = true;

        }
        return true;

    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currenSizs == 0) {
            status = false;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("overflow " + item);
        } else {
            tail++;
            if (tail == capacity) {
                tail = 0;
            }
            queueArr[tail] = item;
            currenSizs++;
            System.out.println("element" + item);
        }

    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currenSizs--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
