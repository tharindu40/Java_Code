import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree_1 {
    Node root;

    public BinarySearchTree_1() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree_1 tree = new BinarySearchTree_1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer to insert into the BST (or any non-integer value to exit): ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                tree.insert(value);
            } else {
                break;
            }
        }

        System.out.println("Inorder traversal of the BST:");
        tree.inorder();

        scanner.close();
    }
}
