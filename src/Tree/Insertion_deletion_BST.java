package Tree;

public class Insertion_deletion_BST
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }
    private static Node insertionBST(Node root,int val)
    {
        if (root==null)
        {
             root=new Node(val);
             return root;
        }
        if (root.data>val)
        {
            root.left=insertionBST(root.left, val);
        }
        else
            root.right=insertionBST(root.right, val);
        return root;
    }
    public static Node delete(Node root,int val)
    {
        // first search the node to be deleted
        if(root==null)
        {
            return null;
        }
        if (root.data>val)
        {
            root.left=delete(root.left,val);
        } else if (root.data<val) {
            root.right=delete(root.right,val);
        }
        else

            // mean root ==data
        // 1 st case both the child are null means deletion of leaf nodes
        {
            if (root.right==null&&root.left==null)
            {
                return null;
            } else if (root.right==null) {
                return  root.left;
            } else if (root.left==null) {
                return root.right;
            }
            else
            {
                // case -3 node have both the child
               Node temp= findInorderSucessor(root.right);
               root.data= temp.data;
              root.right= delete(root.right, temp.data);
            }

        }
        return  root;
    }

    private static Node findInorderSucessor(Node root)
    {
        while (root.left!=null)
        {
            root=root.left;
        }

        return root;
    }
    public  static void inorder(Node root)
    {
        if (root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root=null;
        int [] arr=new int[]{50,10,20,60,80,70,15};
        for (int j : arr) root = insertionBST(root, j);
        System.out.println(root.data);
        inorder(root);
        delete(root,15);
        System.out.println();
        inorder(root);


    }
}
