package JavaEight.JavaEightBaiscs;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> addnum = (a,b)-> a+b;
        System.out.println("Addition of 10 & i5 is " + addnum.apply(10,15));
        BinaryOperator<String> str = (a,b)->a + " Loves with " + b;
        System.out.println(str.apply("Jyouti" ,"Sona"));
    }
}
