package ALGO;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
// Introduction to hashing ,hashmap lecture-2
public class Hashing1
{
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        // insert
        hm.put("INDIA",91);
        hm.put("CHINA",31);
        hm.put("USA",01);
        hm.put("BHUTAN",81);
        System.out.println(hm);
        // get
        int poupulation=hm.get("INDIA");
        System.out.println(poupulation);
        // if key does not exist it wil return the null value
       // int p=hm.get("SRI LANKA");
        //System.out.println(p);

        // contain key- O(1)
        System.out.println(hm.containsKey("INDIA"));
        System.out.println(hm.containsKey("SRI LANKA"));
        // Remove operation
        System.out.println(hm.remove("CHINA"));
        System.out.println(hm);

        // clear - it will every key from the map
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());
    }
}
