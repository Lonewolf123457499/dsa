package Tree;

public class Bstcreation
{
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

        public static  Node bstInsertion(Node root,int val)
        {
            if (root==null)
            {
                root=new Node(val);
                return root;
        }
            if (root.data>val)
            {
                root.left=bstInsertion(root.left,val);
            }
            else
            {
                root.right=bstInsertion(root.right,val);
            }
            return  root;
    }
    public  static  void inorder(Node root)
    {
        if (root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root=null;
        int arr[]=new int[]{8,3,1,10,14,6,4,13,7};
        for (int i=0;i<arr.length;i++)
        {
            root=bstInsertion(root,arr[i]);
        }
        inorder(root);
    }
}
