package ALGO;

import java.util.HashMap;
import java.util.Set;

public class Hashing2
{
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",80);
        hm.put("us",50);
        hm.put("indonesia",6);

        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String k:keys) {
            System.out.println(k+"->"+hm.get(k));
        }

    }

}
