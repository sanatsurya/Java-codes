package JavaEight.Steeems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Billionair{
    private String name;
    private int networth;

    public Billionair(String name, int networth) {
        this.name = name;
        this.networth = networth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    @Override
    public String toString() {
        return "Billionair{" +
                "Name='" + name + '\'' + ", Networth=" + networth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billionair that = (Billionair) o;
        return networth == that.networth && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, networth);
    }
}

public class UniqValuesStream {

    public static void main(String[] args) {
        int []arr = {5,7,8,9,15,2,3,5,7,9};
        Arrays.stream(arr).distinct().forEach(n-> System.out.print(n+" "));
        System.out.println("\n Billiionaris");
        List<Billionair> billionairs = Arrays.asList(
                new Billionair("Elon Musk",9835),
                new Billionair("Zeff bezos",7422),
                new Billionair("Mark Zukerberg",7854),
                new Billionair("Mark Zukerberg",7854),
                new Billionair("Warren Buffet",2245),
                new Billionair("adani",548)

        );

//         billionairs.stream().distinct().forEach(System.out::println);
        List<String> networth1000plus = billionairs.stream().filter(i -> i.getNetworth() > 1000).map(Billionair::getName).toList();
        System.out.println("Networth having 1000plus"+networth1000plus);
    }
}
