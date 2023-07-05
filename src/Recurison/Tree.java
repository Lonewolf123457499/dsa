package Recurison;

import java.util.LinkedList;
import java.util.Queue;

public class Tree
{
    static  class Node {
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
        public static void postorder(Node root)
        {
            if (root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

    }
    public static void levelorder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
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


    public static void main(String[] args)
    {
        Node root=null;
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.left=new Node(50);
        levelorder(root);
        System.out.println();
        postorder(root);

    }


}
