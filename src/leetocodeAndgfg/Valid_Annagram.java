package leetocodeAndgfg;

import java.util.Arrays;

public class Valid_Annagram
{
    public boolean isAnagram(String s, String t)
    {
        int l1=s.length();
        int l2=s.length();
        if(l1!=l2)
        {
            return false;
        }
        char [] arr1=s.toCharArray();
        char[] arr2=s.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length&& i<arr2.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return  true;


    }
}
