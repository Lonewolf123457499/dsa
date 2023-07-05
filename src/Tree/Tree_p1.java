package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_p1 {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }

    }


    Node root;


    public void postorder(Node root)
    {
        if (root==null)
        {
            return;
        }
        postorder(root.left);

        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }

        }
    }


    public static void main(String[] args) {
        Tree_p1 tree=new Tree_p1();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.left.left=new Node(3);
        tree.root.left.right=new Node(4);
        tree.postorder(tree.root);
        System.out.println();
        tree.levelOrder(tree.root);


    }
}
