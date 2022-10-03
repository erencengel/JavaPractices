package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionFunctionalInterface {

    public static void main(String[] args) {
        BiFunction<int[], int[], List<Integer>> addArraysList = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            for (int i : b) list.add(i);
            return list;
        };

        System.out.println(addArraysList
                .apply(new int[]{1, 0, -1}, new int[]{5, 6}));

    }

}
