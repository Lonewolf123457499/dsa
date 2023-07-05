package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class StaticRepresenation {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;
    static int indx = -1;

    public static Node Construct(int arr[]) {
        indx++;
        if (arr[indx] == -1)
            return null;
        Node root = new Node(arr[indx]);
        root.left = Construct(arr);
        root.right = Construct(arr);
        return root;
    }

    public static void preoder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        preoder(root.left);
        preoder(root.right);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        Node root = Construct(arr);
        System.out.println(root.data);
        preoder(root);
    }
}
