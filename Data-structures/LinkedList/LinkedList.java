public class LinkedList {
    public Node head;

    // Add at the start
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at any part of the linkedList with specified value (swapping value)
    public void addAtAnyPoss(int value, int data) {
        Node current = this.head;
        Node newNode = new Node(data);
        if (current == null) {
            current = newNode;
            return;
        }
        if (current.data == value) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }
        while (current.next != null) {
            if (current.next.data == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    // Add at the end
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    // Delete at start
    public void deleteAtStart() {
        if (head == null)
            return;
        head = head.next;
    }

    // Delete the specified value
    public void deleteWithValue(int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Delete at end
    public void deleteAtEnd() {
        Node current = this.head;
        while (current.next != null) {
            if (current.next.next == null) {
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

    // Reverse the LinkedList
    public void reverse() {
        Node current = this.head;
        Node prev = null;
        Node newNext = null;
        System.out.println("1");
        while (current != null) {
            newNext = current.next;
            current.next = prev;
            prev = current;
            current = newNext;
        }
        return;
    }

    @Override
    public String toString() {
        String result = "{ ";
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ", ";
            current = current.next;
        }
        result += "}";
        return result;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // list.addAtStart(5);
        // list.addAtStart(4);
        // list.addAtStart(9);
        // list.addAtStart(11);
        // list.addAtStart(7);

        // list.addAtAnyPoss(4, 22);
        // list.addAtAnyPoss(7, 44);
        // list.addAtAnyPoss(5, 19);

        // list.addAtEnd(13);
        // list.addAtEnd(15);
        // list.addAtEnd(12);
        // list.addAtEnd(14);

        // list.deleteAtStart();

        // list.deleteWithValue(44);
        // list.deleteWithValue(12);
        // list.deleteWithValue(14);
        // list.deleteWithValue(7);

        // list.deleteAtEnd();
        list.reverse();
        System.out.println(list);

    }

}