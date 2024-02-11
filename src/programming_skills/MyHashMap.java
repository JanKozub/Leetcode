class MyHashMap {
    class Node {
        int key;
        int value;
        Node next;

        public Node() {}

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    class Bucket {
        public Bucket() {}

        Node head = null;

        public int get(int key) {
            Node current = head;
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }

                current = current.next;
            }

            return -1;
        }

        public void update(int key, int value) {
            if (head == null) {
                head = new Node(key, value);
                return;
            }

            boolean exists = false;
            Node current = head;
            while (true) {
                if (current.key == key) {
                    current.value = value;
                    exists = true;
                    break;
                }

                if (current.next == null)
                    break;

                current = current.next;
            }

            if (!exists) {
                current.next = new Node(key, value);
            }
        }

        public void remove(int key) {
            if (head == null) return;

            Node current = head;

            if (current.key == key) {
                head = null;
                return;
            }

            while (current.next != null) {
                if (current.next.key == key) {
                    if (current.next.next != null)
                        current.next = current.next.next;
                    else
                        current.next = null;
                    break;
                }

                current = current.next;
            }
        }
    }

    private Bucket[] storage = new Bucket[99563];

    public MyHashMap() {
    }

    int getHash(int key) {
        return key % 99563;
    }

    public void put(int key, int value) {
        if (storage[getHash(key)] == null) {
            storage[getHash(key)] = new Bucket();
        }

        storage[getHash(key)].update(key, value);
    }

    public int get(int key) {
        if(storage[getHash(key)] == null) return -1;
        return storage[getHash(key)].get(key);
    }

    public void remove(int key) {
        if(storage[getHash(key)] == null) return;

        storage[getHash(key)].remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */