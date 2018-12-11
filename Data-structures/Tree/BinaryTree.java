public class BinaryTree {
    Node root;

    // None Recursivly inserting to tree // using while loop
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
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

    // Find Node solution one
    public Node findNode(int data) {
        Node current = root;
        while (current.data != data) {
            if (data < current.data) {
                current = current.left;
                // System.out.println("Node found: " + current);
                // return current;
            } else {
                current = current.right;
                // if (current.data == data) {
                // System.out.println("Node found: " + current);
                // return current;
                // }
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    // Another way FINDING OR CHECKING IF A VALUE EXIST
    public boolean contains(int data) {
        if (root.data == data) {
            return true;
        }
        Node current = this.root;
        while(current.data != data) {
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        return true;
    }
    

    // Find Node solution one
    public Node findNodeSolutionTwo(int data) {
        Node current = root;
        if (current == null) {
            return null;
        }
        while (current != null) {
            if (data < current.data) {
                current = current.left;
                if (current.data == data) {
                    System.out.println("Node found: " + current);
                    return current;
                }
            } else {
                current = current.right;
                if (current.data == data) {
                    System.out.println("Node found: " + current);
                    return current;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int data = 8;
        BinaryTree tree = new BinaryTree();
        tree.insert(4);
        tree.insert(1);
        tree.insert(5);
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(22);
        tree.printInOrder(tree.root);
        // tree.preOrderTraversing(tree.root);
        // tree.postOrderTraversing(tree.root);
        System.out.println("Search for tree: " + tree.findNode(10));
        tree.findNodeSolutionTwo(data);

        tree.contains(12);
    }
}