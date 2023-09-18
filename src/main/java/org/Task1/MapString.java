package org.Task1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapString {
    public static void main(String[] args) {
        String s="wwwaawwwbdddd";
        Map<Character,Integer> ref = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
           char c= s.charAt(i);
          if(ref.containsKey(c)){
          int value= ref.get(c);
          ref.put(c,value+1);
          }else {
              ref.put(c,1);
          }
        }
        System.out.println(ref);
        for (Map.Entry<Character, Integer> entry :ref.entrySet()) {
            System.out.println(entry);
        }
    }
}
