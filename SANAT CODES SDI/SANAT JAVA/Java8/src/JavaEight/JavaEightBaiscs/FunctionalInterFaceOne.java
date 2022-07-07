package JavaEight.JavaEightBaiscs;

@FunctionalInterface
interface Body{
    int age(Integer a, Integer b);
}

public class FunctionalInterFaceOne {
    public static void main(String[] args) {
        Body b1= new Body() {
            @Override
            public int age(Integer a, Integer b) {
                return a-b;
            }
        };
        System.out.println(b1.age(2022,1997));
        Body b2 = (a,b)-> a-b;
        System.out.println(b2.age(2025,1997));
    }
}
