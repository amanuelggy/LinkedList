public class Stack {
    public Node top;

    // Adding to stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // check if it is empty
    public boolean isEmpty() {
        return top == null;
    }

    // get the top data
    public int peak() {
        return top.data;
    }

    // toString
    public String toString() {
        String output = "{ ";
        Node current = top;
        while (current != null) {
            output += current.toString() + ",";
            current = current.next;
        }
        output += " }";
        return output;
    }

    // delete the top one
    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(10);
        stack.push(52);
        stack.push(56);
        System.out.println(stack);
        System.out.println("Is it Empty?: " + stack.isEmpty());
        System.out.println("getting the top one: " + stack.peak());
        System.out.println("the Deleted value is: " + stack.pop());
    }
}