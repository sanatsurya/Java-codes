 abstract class Company{
    void workers(){
        System.out.println("Working");
    }
    abstract void print();
}
public class Abstraction extends Company {

    public static void main(String[] args) {
        Abstraction v = new Abstraction();
        v.workers();
        v.print();
    }

    @Override
    void print() {
        System.out.println("Company Status");
    }
}
