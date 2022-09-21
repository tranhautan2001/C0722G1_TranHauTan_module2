package ss_12_java_collection_framework.practice.practice1;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String ,Integer> hasMap = new HashMap<>();
        hasMap.put("Smith",30);
        hasMap.put("Anderson",31);
        hasMap.put("Lewis",29);
        hasMap.put("Cook",27);
        System.out.println("Display entries in HashMap");
        System.out.println(hasMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));


    }
}
