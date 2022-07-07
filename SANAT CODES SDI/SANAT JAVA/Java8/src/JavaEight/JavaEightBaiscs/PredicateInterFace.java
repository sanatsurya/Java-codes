package JavaEight.JavaEightBaiscs;

import java.util.function.Predicate;

public class PredicateInterFace {
    public static void main(String[] args) {
        Predicate<String> isgreaterthan5 = name-> name.length()>5;
        System.out.println(isgreaterthan5.test("sanat"));
    }


}
