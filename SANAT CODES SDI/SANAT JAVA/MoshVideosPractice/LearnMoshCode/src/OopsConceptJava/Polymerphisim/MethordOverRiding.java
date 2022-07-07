package OopsConceptJava.Polymerphisim;
class calculate {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethordOverRiding {
    public static void main(String[] args) {
        calculate obj = new calculate();
        System.out.println(obj.add(5,6,7));
    }
}
