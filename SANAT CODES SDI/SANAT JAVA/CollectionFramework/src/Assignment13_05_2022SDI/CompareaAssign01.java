package Assignment13_05_2022SDI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareaAssign01 {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(5);
        ll.add(60);
        ll.add(700);
        ll.add(895);
        ll.add(785);
        ll.add(601);
        ll.add(60);
        ll.add(58);
        ll.add(699);
        ll.add(714);
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println("After short of the list" + ll);
    }


}
