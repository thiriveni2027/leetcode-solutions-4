class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node curr = head;

        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }

        return (curr == null) ? -1 : curr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = node;
    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null)
            return;

        Node node = new Node(val);
        node.next = curr.next;
        curr.next = node;
    }

    public void deleteAtIndex(int index) {

        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null)
            return;

        curr.next = curr.next.next;
    }
}