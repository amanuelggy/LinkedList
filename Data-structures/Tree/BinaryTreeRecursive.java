public class BinaryTreeRecursive {

    public Node root;

    // converting outputs to string
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
    public Node append(int data) {
        Node newroot = new Node(data);
        if (root == null) {
            root = newroot;
            return root;
        }
        // while (root != null) {
        if (data <= root.data) {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                append(data);
                return root.left;
            }
        } else {
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                append(data);
                return root.right;
            }
        }
        return root;
    }

    // Inorever traversing through tree
    public void inOrderTraversing(Node current) {
        if (current != null) {
            inOrderTraversing(current.left);
            System.out.println(current);
            inOrderTraversing(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeRecursive tree = new BinaryTreeRecursive();
        tree.append(7);
        tree.append(4);
        tree.append(1);
        tree.append(5);
        tree.append(10);
        tree.append(8);
        tree.append(7);
        tree.append(22);
        tree.inOrderTraversing(tree.root);
        // tree.preOrderTraversing(tree.root);
        // tree.postOrderTraversing(tree.root);
    }
}