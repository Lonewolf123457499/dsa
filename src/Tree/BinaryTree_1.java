package Tree;

import javax.swing.*;
import java.security.KeyPair;
import java.util.*;

public class BinaryTree_1
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
    class Pair
    {
        Node node;
        int hd;
        public Pair(Node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    Node root;
    // this function display the inorder traversal of tree.
    void printTree(Node node)
    {
        if (node!=null)
        {
            printTree(node.left);
            System.out.println(node.data+" ");
            printTree(node.right);
        }
    }
    public void preOrder(Node node)
    {
        if (node==null)
        {
            return ;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node)
    {
        if (node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    // level order traversal of a binary tree using queue.....
    public void levelOrder(Node node)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int levelsize= q.size();
           // int p=1;
            System.out.print("Level"+"--");
            for (int i=0;i<levelsize;i++)
            {
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if (curr.left!=null)
                {
                q.add(curr.left);
            }
                if (curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }

    }
    //iterative preorder traversal
    public void iterative_preorder(Node root)
    {
        if (root==null)
            return;
        Stack<Node>st=new Stack<>();
        st.push(root);
        while (!st.isEmpty())
        {
            Node node=st.pop();
            System.out.print(node.data);
            if (node.right!=null)
            {
                st.push(node.right);
            }
            if (node.left!=null)
            {
                st.push(node.left);
            }
            System.out.print(" ");
        }
    }
    // Iterative Inorder traversal
    public void inorder_Iterative(Node tree)
    {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(true)
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            else
            {
                if (stack.isEmpty())
                    break;
                curr=stack.pop();
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
        }

    }
     public void iterative_postorder()
    {
        Stack<Node> st1=new Stack<>();
        Stack<Node>st2=new Stack<>();
        if (root==null)
            return;
        st1.push(root);
        while (!st1.isEmpty())
        {
            root=st1.pop();
            st2.push(root);
            if (root.left!=null)
            {
                st1.push(root.left);
            }
            if (root.right!=null)
            {
                st2.push(root.right);
            }
        }
        while (!st2.isEmpty())
        {
            System.out.println(st2.pop().data);
        }

    }
    public int maxdepth(Node root)
    {
        if (root==null)
            return 0;
       int  l= maxdepth(root.left);
       int r =maxdepth(root.right);
        return 1+Math.max(l,r);

        //  }
    }
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }

    public boolean isBalanced(Node root)
    {
        if(root==null)
        {
            return true;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1)
        {
            return false;
        }
        Boolean right=isBalanced(root.left);
        Boolean left=isBalanced(root.right);
        if(right==false||left==false)
        {
            return false;
        }
        return true;
    }
    boolean isLeave(Node root)
    {
        return root.left==null&& root.right==null;
    }
    public void addLeft(Node root,ArrayList<Integer> list)
    {
        Node curr=root.left;
        while(curr!=null)
        {
            if(!isLeave(curr))
            {
                list.add(curr.data);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }

    }
    public void addRight(Node root,ArrayList<Integer>res)
    {
        Node cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (!isLeave(cur)) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }

    }
    public void addLeave(Node root,ArrayList<Integer> ans)
    {
        if(isLeave(root)==true)
        {
            ans.add(root.data);
            return;

        }
        if(root.left!=null)
        {
            addLeave(root.left,ans);

        }
        if(root.right!=null)
        {
            addLeave(root.right,ans);
        }
    }
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(isLeave(node)==false)
        {
            ans.add(node.data);

        }
        addLeft(node,ans);
        addLeave(node,ans);
        addRight(node,ans);
        return ans;

    }
    public ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) {
            return new ArrayList<>();
        }
        Map<Integer,Integer>map =new TreeMap<>();
        Queue<Pair>q= new LinkedList<>();
        q.add(new Pair(root,0));
        while (!q.isEmpty())
        {
            Pair it=q.remove();
            int hd= it.hd;
            Node temp=it.node;
            if(map.get(hd)==null) map.put(hd, temp.data);
            if (temp.left!=null)
            {
                q.add(new Pair(temp.left,hd-1));
            }
            if (temp.right!=null)
            {
                q.add(new Pair(temp.right,hd+1));
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                ans.add(entry.getValue());
            }
            //return ans;

        }
        return ans;

    }
    // Morris Inorder Traversal
    public void morris_Inorder(Node root)
    {
        Node curr=root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
            else
            {
                Node prev=curr.left;
                while (prev.right!=null&&prev.right!=curr)
                {
                    prev=prev.right;
                }
                if (prev.right==null)
                {
                    prev.right=curr;
                    curr=curr.left;
                }
                else
                {
                    prev.right=null;
                    System.out.print(curr.data+" ");
                    curr=curr.right;

                }
            }
        }
    }
    public  static void reverseLevelOrder(Node root)
    {
        Stack<Node > st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node curr=st.pop();
            System.out.println(curr.data);
            if(curr.right!=null)
            {
                st.add(curr.right);
            }
            if (curr.left!=null)
            {
                st.add(curr.left);
            }
        }
    }
    public  void ancestor(Node root,int key) {
        if (root == null) {
            return;
        }
        if (root.data != key) {
            ancestor(root.left, key);
            System.out.println(root.data);
            ancestor(root.right, key);
        }
    }
        public static boolean searching(Node root,int key)
        {
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            while (!q.isEmpty())
            {
                Node curr=q.poll();

                if (curr.data==key)
                {
                    return  true;
                }
                if (curr.left!=null)
                {
                    q.add(curr.left);
                }
                if (curr.right!=null)
                {
                    q.add(curr.right);
                }

        }
            return  false;

    }
    public  static void insert(Node root,int data)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if (curr.left==null)
            {
                curr.left=new Node(data);
                break;
            }
            else
            {
                q.add(curr.left);
            }
            if (curr.right==null)
            {
                curr.right=new Node(data);
                break;
            }
            else
            {
                q.add(curr.right);
            }
        }
    }





    public static void main(String[] args) {


        BinaryTree_1 tree=new BinaryTree_1();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.left.left.left=new Node(6);
        tree.root.left.left.right=new Node(7);
        tree.root.right.left=new Node(8);
        tree.root.right.right= new Node(9);
      // tree.printTree(tree.root);
        //System.out.println();
       // tree.inorder_Iterative(tree.root);
       // System.out.println();
        //tree.iterative_postorder()System.out.println(tree.maxdepth(tree.root));
        //tree.levelOrder(tree.root);
//       ArrayList<Integer>list= tree.boundary(tree.root);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        tree.morris_Inorder(tree.root);
       // tree.reverseLevelOrder(tree.root);
        //tree.ancestor(tree.root,4);
//        System.out.println(searching(tree.root,3));
        tree.inorder_Iterative(tree.root);
        insert(tree.root,45);
        System.out.println();
        tree.inorder_Iterative(tree.root);


    }
}
