package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST_insertion_And_deletion
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node (int data)
        {
            this.data=data;
        }
    }

    public  static Node constructBST(Node root,int val)
    {
        if(root==null)
        {
            // create a new Node
            root=new Node(val);
            return root;
        }
        if(root.data>val)
        {
           root.left= constructBST(root.left,val);
        }
        else
        {
            root.right=constructBST(root.right,val);
        }
        return root;
    }


    public  static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node deleteNode(Node root,int key)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data>key)
        {
            root.left=deleteNode(root.left,key);
        } else if (root.data<key) {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            // case -1  delete leaf node
            if(root.right==null&&root.left==null)
            {
                return null;
            }
            // case -2 node having one child only
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            } // case -3 when node to be deleted having two children
            else
            {
                Node Is=getInorderSucessor(root.right);
                root.data=Is.data;
                deleteNode(root,Is.data);

            }
        }
        return root;
    }

    private static Node getInorderSucessor(Node root)
    {
        while (root.left!=null)
        {
           root=root.left;
        }
        return  root;
    }
    public static boolean search( Node root,int key) {
        if (root == null) {
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (key == current.data) {
                return true;
            }
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return false;
    }
    public static  Node searchingl(Node root, int data)
    {
        if(root==null)
            return root;
        if (root.data==data)
        {
            return  root;
        }
        if (root.data>data)
        {
            root.left=searchingl(root.left,data);
        }
        else
            root.right=searchingl(root.right,data);
        return  root;
    }

    public static void main(String[] args) {
        Node root=null;
        int [] arr=new int[]{7,5,3,1,4,6,12,9,8,10,15,13,17};
        for (int j : arr) {
            root = constructBST(root, j);
        }
//        System.out.println(root.data);
        inorder(root);
        deleteNode(root,5);
        System.out.println();
        inorder(root);


        //System.out.println( searching(root,10));

    }
}
