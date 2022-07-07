package JavaEight.JavaEightBaiscs;

interface Operands{
    void  myname();
}
class Operate{
    public void Operations(){
        System.out.println("Isnstance methord");
    }
}
public class MethordReferenceOne {
    public static void Yourname(){
        System.out.println("My name is mr mallick");
    }
    public static void main(String[] args) {
        Operands op = MethordReferenceOne::Yourname;
        op.myname();
        Operate mr2 = new Operate();
        Operands op2 = mr2 ::Operations;
        op2.myname();

    }
}
