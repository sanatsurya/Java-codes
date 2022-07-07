package JavaEight.JavaEightBaiscs;

interface Operation{
    int Operation(int a, int b);
}
class Substraction{
    int subtract(int a, int b){
        return a-b;
    }
}
class Multiply{
    int Multiply(int a, int b){
        return a*b;
    }
}
public class MethordReferenceTwo {
    static class Operator{
        static int addition(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        Operation op1 = Operator::addition;//This is for static method
        System.out.println(op1.Operation(8,9));
        Substraction subs = new Substraction();
        Operation Op2 = subs::subtract;//This is nonstatic Reference
        System.out.println("Result is " + Op2.Operation(6,5));
        Multiply m1 = new Multiply();
        Operation op3 = m1::Multiply;
        System.out.println(op3.Operation(6,7));
    }
}
