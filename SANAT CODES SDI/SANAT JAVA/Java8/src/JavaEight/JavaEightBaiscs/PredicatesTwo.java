package JavaEight.JavaEightBaiscs;

import java.util.function.Predicate;

public class PredicatesTwo {
    public static void main(String[] args) {
        Predicate<String> startswitha = name -> name.startsWith("a");
        Predicate<String> endswiths = name-> name.endsWith("s");
        Predicate<String> startsaendss = name -> startswitha.test(name)&&endswiths.test(name);
        String input ="Aditya Chotray is a legned political leaders";
        boolean resule = startsaendss.test(input);
        System.out.println(resule);
        Predicate<String> startsorendswithaandx = startswitha.or(endswiths);
        System.out.println(startsorendswithaandx);
    }
}
