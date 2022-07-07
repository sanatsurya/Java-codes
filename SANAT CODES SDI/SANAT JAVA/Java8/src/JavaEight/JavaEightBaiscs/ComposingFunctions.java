package JavaEight.JavaEightBaiscs;

import java.util.function.Function;
//name
//name+lenght
//{name:length}
public class ComposingFunctions {
    public static void main(String[] args) {
        Function<String , String> toupper= name-> name.toUpperCase();
        System.out.println("The upercase of legion is " + toupper.apply("legion"));
        Function<String,String> whsize = name->name+":"+ name.length();
        System.out.println("The size of legion is " + whsize.apply("legion"));
        Function<String,String> fet3 = name-> "{"+name+":"+ name.length()+ "}";
        System.out.println("The fetchme7 & its size is " + fet3.apply("fetchme"));
        String finalvalue = toupper.andThen(whsize).andThen(fet3).apply("SuryaSanat");
        System.out.println(finalvalue);
    }
}
