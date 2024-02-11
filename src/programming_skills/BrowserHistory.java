package programming_skills;


public class BrowserHistory {
    private Node head;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
    }

    public void visit(String url) {
        head.setNext(new Node(url));
        head.getNext().setPrev(head);
        head = head.getNext();
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (head.getPrev() == null) return head.getValue();

            head = head.getPrev();
        }

        return head.getValue();
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (head.getNext() == null) return head.getValue();

            head = head.getNext();
        }

        return head.getValue();
    }
}

class Node {
    private String value;
    private Node prev;
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}