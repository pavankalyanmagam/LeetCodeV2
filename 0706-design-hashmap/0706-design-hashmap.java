class MyHashMap {

    // The container for data
    class Node {
        int key;
        int value;
        Node next; // In case of collisions

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // The "Buckets" (The Array)
    // Each slot is the head of a linked list
    private Node[] buckets;
    private int size; // How many buckets do we have?


    public MyHashMap() {
        this.size = 769;
        this.buckets = new Node[size];
    }

    // 1. The Helper: Turns a Key into an Index
    private int getBucketIndex(int key) {
        return key % size;
    }

    // 2. The Main Action: Insert or Update
    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        Node head = buckets[bucketIndex];

        // SCENARIO 1: Update existing key
        // Walk the list to see if the key already exists
        Node current = head;
        while(current !=null) {
            if(current.key == key) {
                current.value = value; // Found it! Update value.
                return; // We are done.
            }
            current = current.next;
        }

        // SCENARIO 2: Insert new key
        // If we are here, the key is new.
        Node newNode = new Node(key, value);
        newNode.next = head; // Point new node to old head
        buckets[bucketIndex] = newNode; // Make new node the head.
    }
    
    
    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        Node head = buckets[bucketIndex];

        // Walk the chain
        Node current = head;
        while(current != null) {
            if(current.key == key) {
                return current.value; // Found it!
            }
            current = current.next;
        }
        return -1; // Key not found
    }
    
    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        Node current = buckets[bucketIndex];
        Node prev = null;

        while(current != null) {
            if(current.key == key) {

                if(prev == null) {
                    // removing head
                    buckets[bucketIndex] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */