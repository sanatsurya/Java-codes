package JavaEight.JavaEightBaiscs;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
//Print , convert to upper, add a value to it
public class ChaningOfConsumerFInterface {
    public static void main(String[] args) {
        List<String> Brother = Arrays.asList("Sanat","Lalitendu","Sitakanta","Asutosh","Harihar","Jitendra");
        Consumer<String> print_stud = names -> System.out.println(names);
        Consumer<String> toUpper = name -> System.out.println(name.toUpperCase()) ;
        Consumer<String> concad = name-> System.out.println(name.concat("1523")) ;
        Consumer<String> tolower = name-> System.out.println(name.toLowerCase(Locale.ROOT));
        Consumer<String> separate = name-> System.out.println("\n************");
//        Brother.forEach(print_stud);
//        Brother.forEach(toUpper);
//        Brother.forEach(concad);
        Brother.forEach(print_stud.andThen(toUpper).andThen(concad).andThen(tolower).andThen(separate));
    }
}
