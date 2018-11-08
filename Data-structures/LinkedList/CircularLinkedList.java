public class CircularLinkedList {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(0);
        list.add(9);
        System.out.println(list);
    }

    public String toString() {
        Node current = head;
        String result = "{";
        while (current != null) {
            result += current.toString() + ", ";
            current = current.next;
        }
        result += " }";
        return result;
    }

    public Node head;
    public Node tail;
    public int size;

    // adding to regular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            tail = head;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            size++;
            current = current.next;
        }
        tail.next = newNode;
        tail = newNode;
        // size++;
        System.out.println("size of list: " + size);
        return;
    }
    // creating
}