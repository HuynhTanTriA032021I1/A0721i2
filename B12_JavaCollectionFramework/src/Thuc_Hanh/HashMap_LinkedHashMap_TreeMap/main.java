package Thuc_Hanh.HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {

        //HashMap
        System.out.println("!!HashMap!!");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        //TreeMap
        System.out.println("\n!!TreeMap!!");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        //LinkedHashMap
        System.out.println("\n!!LinkedHasMap!!");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
