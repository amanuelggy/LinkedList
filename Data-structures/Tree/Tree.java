public class Tree {
    public Node root;

    public Tree() {

    }

    public String toString() {
        Node current = root;
        String result = "{";
        while (current != null) {
            result += current.toString() + ", ";
            if (current.left != null) {
                current = current.left;
            }
            if (current.right != null) {
                current = current.right;
            }
        }
        result += " }";
        return result;
    }

    // inserting to tree using recursive
    // public Node append(int data) {
    // Node newroot = new Node(data);
    // if (root == null) {
    // root = newroot;
    // return root;
    // }
    // // while (root != null) {
    // if (data <= root.data) {
    // if (root.left == null) {
    // root.left = new Node(data);
    // } else {
    // root.left = append(data);
    // return root.left;
    // }
    // } else {
    // if (root.right == null) {
    // root.right = new Node(data);
    // } else {
    // root.right = append(data);
    // return root.right;
    // }
    // }
    // return root;
    // }

    // None Recursivly inserting to tree
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }
        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }

            }

        }
    }

    // Inorder Traversing through tree
    public void printInOrder(Node current) {
        if (current != null) {
            printInOrder(current.left);
            System.out.println(current);
            printInOrder(current.right);

        }
    }

    // Pre-order Traversing through tree
    public void preOrderTraversing(Node current) {
        if (current != null) {
            System.out.println(current);
            preOrderTraversing(current.left);
            preOrderTraversing(current.right);

        }
    }

    // Post-order Traversing through tree
    public void postOrderTraversing(Node current) {
        if (current != null) {
            postOrderTraversing(current.left);
            postOrderTraversing(current.right);
            System.out.println(current);

        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(4);
        tree.insert(1);
        tree.insert(5);
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(22);
        tree.printInOrder(tree.root);
        tree.preOrderTraversing(tree.root);
        tree.postOrderTraversing(tree.root);
        // System.out.println(tree);
    }
}