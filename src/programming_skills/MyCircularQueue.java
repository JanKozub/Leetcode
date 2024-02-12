package programming_skills;

class MyCircularQueue {
    private Node front;
    private Node rear;
    private int length = 0;
    private final int size;

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.print();
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.print();
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.print();
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.print();
        myCircularQueue.Rear();     // return 3
        myCircularQueue.print();
        myCircularQueue.isFull();   // return True
        myCircularQueue.print();
        myCircularQueue.deQueue();  // return True
        myCircularQueue.print();
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.print();
        System.out.println(myCircularQueue.Rear());     // return 4
        myCircularQueue.print();
    }

    public MyCircularQueue(int k) {
        this.size = k;
    }

    public void print() {
        Node current = front;
        System.out.print("length: " + length + "; ");
        while(current != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
        System.out.println("");
    }

    public boolean enQueue(int value) {
        if (length == 0){
            front = new Node(value);
            rear = front;
            length++;
            return true;
        }

        if (length == size) return false;

        rear.next = new Node(value);
        rear = rear.next;
        length++;

        return true;
    }

    public boolean deQueue() {
        if (length == 0) return false;
        if (length == 1) rear = null;

        front = front.next;
        length--;

        return true;
    }

    public int Front() {
        return front == null ? -1 : front.val;
    }

    public int Rear() {
        return rear == null ? -1 : rear.val;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == size;
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
