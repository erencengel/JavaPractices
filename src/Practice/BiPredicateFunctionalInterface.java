package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterface {

    public static void main(String[] args) {
        BiPredicate<int[], Integer> contains = (arr, n) -> {
            if(new ArrayList<>(Arrays.asList(arr)).contains(n)) return true;
            return false;
        };
        System.out.println(contains.test(new int[]{10, 0, -20, -50, 100}, 10));

        BiPredicate<String,String> isAnagram = (s1,s2) -> {
            //s1.toCharArray(); this is an array which contains each character of String as a char
            //s2.toCharArray(); this is an array which contains each character of String as a char
            String[] split = s1.trim().split("");
            String[] split1 = s2.trim().split("");
            Arrays.sort(split);
            Arrays.sort(split1);
            if(Arrays.equals(split,split1)) return true;
            return false;
        };
        System.out.println(isAnagram.test("level ", "elvel"));

        System.out.println("------------------------------------");

        BiPredicate<List<Integer>,Integer> isDuplicated = (arraylist, num) -> {
            if(Collections.frequency(arraylist,num) > 1) return true;
            return false;
        };

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,3,3,4,5,5,5,6));
        list.forEach(s-> {
            if(!isDuplicated.test(list,s)) System.out.print(s + " ");
        } );

    }
}
