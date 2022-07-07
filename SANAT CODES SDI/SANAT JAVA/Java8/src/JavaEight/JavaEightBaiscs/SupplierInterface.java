package JavaEight.JavaEightBaiscs;

import java.util.function.Supplier;
class SupplierObj implements Supplier{

    @Override
    public Object get() {
        return Math.random()*15000;
    }
}
public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Double> sp1 = ()-> Math.random()*1000;
        Double aDouble = sp1.get();
        System.out.println(aDouble);
        Supplier<Double> sp2 = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random()*10000;
            }
        };
        System.out.println(sp2.get());
        //This is normal interface or class level Implementation 
        SupplierObj spro = new SupplierObj();
        System.out.println("The implementation "+spro.get());
    }
}
