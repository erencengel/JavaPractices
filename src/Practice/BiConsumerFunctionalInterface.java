package Practice;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {
        BiConsumer<String,Integer> printAsNum = (s,n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printAsNum.accept("Aslıhan", 3);
        System.out.println();

        System.out.println("------------------");

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2020,10,25));
        map.put("Jimmy", LocalDate.of(2019,10,25));
        map.put("Aaron", LocalDate.of(2018,10,25));
        map.put("Shay", LocalDate.of(2017,10,25));

        map.forEach((k,v) -> {
            if(v.getYear()<2019) System.out.println(k);
        });



    }

}
