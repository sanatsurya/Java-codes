package JavaEight.JavaEightBaiscs;

import java.util.function.Function;
// to print nameuppercase: lowercase
// to print name: lenght
//to print {uppercase : name}
public class FunctionInterface {
    public static void main(String[] args) {
        Function<String,String> upperlower = name-> name.toUpperCase()+":" + name.toLowerCase();
       Function<String, String> FetchLenghth = name ->name+":" + name.length();
       Function<String,String> repeatfive = name-> name.toUpperCase();
        //System.out.println("Length of legend is " + FetchLenghth.apply("Legend"));
        String sname = "sanat";
        String sanat = upperlower.andThen(FetchLenghth).andThen(repeatfive).apply(sname);
        System.out.println(sanat);
    }
}
