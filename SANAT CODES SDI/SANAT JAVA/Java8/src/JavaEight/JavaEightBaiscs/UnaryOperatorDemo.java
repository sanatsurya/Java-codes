package JavaEight.JavaEightBaiscs;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = num -> num*num;
        System.out.println(square.apply(25));
        UnaryOperator<Integer> increment = num -> ++num;
        System.out.println(increment.apply(5));
        UnaryOperator<Integer> decrement = num->--num;
        System.out.println(decrement.apply(8));
        Function<Integer,Integer> incresquare=increment.andThen(square);
        System.out.println(incresquare.apply(5));

    }
}
