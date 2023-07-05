package Recurison;

public class Arrayprint
{
    public static void arrayPrint(int arr[],int si)
    {
        if(arr.length==si)
        {
            return;
        }
        System.out.println(arr[si]);
        arrayPrint(arr,si+1);
    }
    public static void numberPrint(int n)
    {
        if (n == 0) {
            return ;
        }
        System.out.println(n +"");;
       // System.out.println(" pre" + n);
        numberPrint(n-1);
       // System.out.println(" in -> "+n);
        numberPrint(n-1);
       // System.out.println("post-> "+n);
    }

    public static void Str(String str[])
    {
        for(String s:str)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
      //  int arr[]={0,1,2,3,4,5};
        //Str(new String[]{"vedant","singh","chandel"});
        //arrayPrint(arr,0);
        numberPrint(4);

    }
}
