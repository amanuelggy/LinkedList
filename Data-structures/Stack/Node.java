public class Node {
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public String toString() {
        return "Data: " + this.data;
    }
}