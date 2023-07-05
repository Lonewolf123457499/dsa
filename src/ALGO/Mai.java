package ALGO;

import java.util.ArrayList;
import java.util.Arrays;

public class Mai
{
    class Node
    {
        int data;
        int stCode;
        Node next;
        Node(int data, int stCode)
        {
            this.data=data;
            this.stCode=stCode;
        }
    }
        Node head=null;
        Object []feasible=new Object[]{1,2,3,4,5};
        ArrayList obj=new ArrayList(Arrays.asList(feasible));
        Node insertAtLast(Node head, int data, int stCode)
        {
            if(Arrays.binarySearch(feasible,stCode)>=0) {
                Node n = new Node(data, stCode);
                Node currentNode=head;
                if (head != null) {
                    while (currentNode.next!=null)
                        currentNode=currentNode.next;
                    currentNode.next=n;
                }
                else
                    head=n;
                obj.remove((Object)stCode);
                feasible=obj.toArray();
            }
            return head;
        }
        public static void main(String[] args) {
            Mai TrainA=new Mai();
            Mai TrainB=new Mai();
            TrainA.head=TrainA.insertAtLast(TrainA.head,12,5);
            TrainA.head=TrainA.insertAtLast(TrainA.head,13,4);
            TrainB.head=TrainB.insertAtLast(TrainB.head,14,5);
            TrainB.head=TrainB.insertAtLast(TrainB.head,15,5);}
    }

