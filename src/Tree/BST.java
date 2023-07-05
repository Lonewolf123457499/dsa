package Tree;

public class BST
{
    static class TreeNode
    {
        TreeNode left;
        TreeNode right;
        int  data;
        public TreeNode(int data) {
            this.data = data;
        }
    }
    TreeNode root;
    public static TreeNode insert(TreeNode root, int val)
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val);
        }
        return root;

    }
    public static TreeNode searching(TreeNode root,int data)
    {
        if(root==null)
            return root;
        if (root.data==data)
        {
            return  root;
        }
        if (root.data>data)
        {
            root.left=searching(root.left,data);
        }
        else
            root.right=searching(root.right,data);
        return  root;
    }
    public  static void inorder(TreeNode root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.left);
    }

    public static void main(String[] args) {
        int arr[]=new int[]{5,1,3,4,2,7};
        TreeNode root=null;
        for(int i=0;i<arr.length;i++)
        {
           root= insert(root,arr[i]);
        }
        inorder(root);
        searching(root,4);





    }
}
