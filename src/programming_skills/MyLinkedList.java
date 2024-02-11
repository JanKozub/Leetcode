package programming_skills;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

//        System.out.println(myLinkedList.get(1));
//
//        myLinkedList.addAtHead(7);
//        myLinkedList.print();
//
//        myLinkedList.deleteAtIndex(1);
//        myLinkedList.print();
//
//        myLinkedList.addAtTail(5);
//        myLinkedList.print();
//
//        myLinkedList.addAtIndex(2, 6);
//        myLinkedList.print();
//
//        myLinkedList.deleteAtIndex(2);
//        myLinkedList.print();

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + ", ");
            current = current.next;
        }
        System.out.println("");
    }

    public int get(int index) {
        System.out.println("getting " + index + " | L: " + length);
        if (index > length)
            return -1;

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        //System.out.println(current != null ? current.value : -1);
        // print();

        return current != null ? current.value : -1;
    }

    public void addAtHead(int val) {
        System.out.println("Adding to head " + val + " | L: " + length);

        Node node = new Node(val);
        length++;

        if (head == null) {
            head = node;
            tail = head;

            // print();

            return;
        }

        node.next = head;
        head.prev = node;
        head = node;

        // print();
    }

    public void addAtTail(int val) {
        System.out.println("Adding to tail " + val + " | L: " + length);
        if (length == 0) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail.next.prev = tail;
            tail = tail.next;
        }
        length++;

        // print();
    }

    public void addAtIndex(int index, int val) {
        System.out.println("Adding to index " + index + " " + val + " | L: " + length);
        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index > length)
            return;

        Node current = head;
        length++;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node node = new Node(val);
        node.next = current;
        node.prev = current.prev;
        current.prev.next = node;
        current.prev = node;

        // print();
    }

    public void deleteAtIndex(int index) {
        System.out.println("Deleting at index " + index + " | L: " + length);
        if (index < 0)
            return;
        if (index > length - 1)
            return;

        length--;

        if (index == 0) {
            head = head.next;
            // print();
            return;
        }

        if (index == length) {
            tail.prev.next = null;
            tail = tail.prev;

            // print();
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

        // print();
    }

    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
