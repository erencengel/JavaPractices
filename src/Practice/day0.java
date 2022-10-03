package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class day0 {

    public static void main(String[] args) {
        Predicate<String> concat = s -> new StringBuffer(s).reverse().toString().equals(s);
        System.out.println(concat.test("level"));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,5,20,100,500));
        arrayList.removeIf(p -> p>40);
        System.out.println(arrayList);

        Consumer<Integer> multiplyby2 = s -> System.out.println(s*2);
        multiplyby2.accept(10);
        arrayList.forEach(p -> System.out.println(3*p));

        Supplier<String> supplier =() -> "Hello World";
        System.out.println(supplier.get());

        Function<String, Integer> function = s -> {
            switch (s){
                case "one":
                    return 1;
                case "two":
                    return 2;
                case "three":
                    return 3;
                default:
                    return 0;
            }
        };

        System.out.println(function.apply("one"));
        System.out.println(function.apply("Aslıhan"));
    }

}
