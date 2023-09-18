package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[] args) {
        String str = "wwwaabdddd";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int value = map.get(c);
                map.put(c, value + 1);
            } else {
                map.put(c, 1);
            }

        }
      Set<Map.Entry<Character,Integer>> ref =  map.entrySet();
        for (Map.Entry<Character,Integer> re : ref) {
            System.out.print(re.getKey());
            System.out.print(re.getValue());
        }
    }




    }

