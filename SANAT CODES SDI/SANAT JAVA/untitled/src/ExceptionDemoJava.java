import org.w3c.dom.ls.LSOutput;

public class ExceptionDemoJava {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("We failed to divide the reason is " + e.getMessage());
        }
        System.out.println("The program is end here");
    }
}
