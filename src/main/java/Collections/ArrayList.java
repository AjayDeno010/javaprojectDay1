package Collections;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        //Adding colors
        java.util.ArrayList<String> ref= new java.util.ArrayList<>();
        ref.add("Bule");
        ref.add("Green");
        ref.add("white");
        ref.add("yello");
        ref.add("Silver");
        ref.set(0,"Pink");
        ref.add(0,"Orange");
        System.out.println(ref);
       for(int i=0;i<ref.size();i++){
           System.out.println(ref.get(i));
       }
        System.out.println(ref.get(2));
        System.out.println(ref.contains("yello"));
        ref.remove(3);
        System.out.println(ref);
       Collections.sort(ref);
        System.out.println(ref);
        java.util.ArrayList<String> ref1= ref;
        for (String value : ref1) {
            System.out.println(value);
        }
//       ref.set(0,"Pink");
    }
}
