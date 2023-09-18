package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        java.util.function.Predicate<Integer> ref=  new java.util.function.Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
        java.util.function.Predicate<Integer> ref1= (i)-> i%2==0;
        java.util.function.Predicate<Integer> ref2= (i)-> i>3;
//        System.out.println(ref1.test(10));
        for (Integer i: list) {
            if(ref1.or(ref2).test(i))
            System.out.println(ref1.test(i));
        }
        // Function
        Function<Integer,Integer> function= i-> i= i*i*i;
        Function<Integer,Integer> function2= i-> i%2;
        Integer S= function.apply(3);
        System.out.println(S);

    }
}
