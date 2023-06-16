package example;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("a", 10);
        map.put("c", 11);
        map.put("e", 10);
        map.put("b", 13);
        map.put("d", 15);

        /**
         * remove duplicates
         */
        Set<Integer> set = new HashSet<>();

        Map<String, Integer> uniqueMap = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(set.add(entry.getValue())) {
                uniqueMap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(uniqueMap);
        /**
         * ------------------------
         */
        try{
            int age = uniqueMap.get("a");
            System.out.println(age);
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
