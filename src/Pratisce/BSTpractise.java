package Pratisce;

import Tree.BST_insertion_And_deletion;

public class BSTpractise
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
        public static Node construct(Node root, int val)
        {
            if (root==null)
            {
                root=new Node(val);
                return root;
            }
            if (root.data>val)
            {
                root.left=construct(root.left,val);
            }
            else
            {
                root.right=construct(root.right,val);
            }
            return  root;
        }
        public static void inorder(Node root)
        {
            if (root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }
        public static Node deleteNode(Node root, int key)
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
                    root.right= deleteNode(root.right,Is.data);

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
            return root;
        }
        public static  Node searching(Node root,int key)
        {
            if (root==null)
                return root;
            if (root.data==key)
                return root;
            if (root.data>key)
                root.left=searching(root.left,key);
            else
                root.right=searching(root.right,key);
            return root;

        }

        public static void main(String[] args) {
            int arr[]={50,60,20,30,80,45};
            Node root=null;
            for (int i=0;i<arr.length;i++)
            {
                root=construct(root,arr[i]);
            }
            inorder(root);
            deleteNode(root,50);
            System.out.println();
            inorder(root);
            Node temp=searching(root,60);
            if (temp.data==60)
            {
                System.out.println("present");
            }
        }

    }
}
