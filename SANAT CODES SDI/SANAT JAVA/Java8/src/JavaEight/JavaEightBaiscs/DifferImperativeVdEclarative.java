package JavaEight.JavaEightBaiscs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DifferImperativeVdEclarative {
    public static void main(String[] args) {
        List<Integer> List1 = Arrays.asList(54,51,89,94,87,67);

        for (int i = 0; i < List1.size(); i++) {
            int cn = List1.get(i);
            System.out.println(cn);
        }
        List<String> List2 = Arrays.asList("Abhinandan","Brajesh","Jitendra","Tapan","Sashi","Bapi");
        Consumer<String> print_name = names -> System.out.println(names);
        List2.forEach(print_name);

    }

}
