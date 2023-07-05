package Recurison;

import java.util.ArrayList;

public class All_Indcies
{
    public static int   all_indices(int arr[],int si,int data)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(si==arr.length)
        {
            return -1;
        }
        if(arr[si]==data)
        {
            System.out.println(si);
        }
       return  all_indices(arr, si+1, data);

    }
    // Remove the duplicate in the String using recursion
    public static String removeString(String str,int si)
    {
        if(str.length()==si)
        {
            return " ";
        }
       String s= removeString(str,si+1);
        char ch=s.charAt(si);
        if(ch!='a')
        {
            return  s+ch;
        }
        return s;
    }
    public static String reverseString(String s, int index)
    {
        if(index==s.length())
            return " ";
        String str=reverseString(s,index+1);
        return str+s.charAt(index);
    }
    public static  boolean isPalidrome(String str, int l, int r)
    {
        if(l>=r)
            return  true;
        return false;
    }
    public static void printSS(String str)
    {
        if(str.length()==0)
        {
            return ;
        }
        char currchar=str.charAt(0);
        String ss=str.substring(1);
        printSS(ss);
        System.out.println(currchar+ss);
        System.out.println(currchar);
    }
    public static void main(String[] args) {
        //all_indices(new int[]{10,20,20,20,20},0,20);
        //System.out.println( removeString("abcax",0));
       // System.out.println(reverseString("helllo",0));
        String str="madam";
        //System.out.println(isPalidrome(str,0,str.length()));
        printSS("abc");
    }
}
