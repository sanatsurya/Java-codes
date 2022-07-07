package Assignment13_05_2022SDI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class items implements Comparable<items> {
    private int item_id;
    private String item_name;
    private int price;

    @Override
    public String toString() {
        return "items{" +
                "Product id=" + item_id +
                ", Product name='" + item_name + '\'' +
                ", price=" + price +
                '}';
    }

    items(int item_id, String item_name, int price){
        this.item_id= item_id;
        this.item_name=item_name;
        this.price=price;

    }

//    @Override
//    public int compareTo(items i) {
//        if(this.item_name)
//    }


//    @Override
    public int compareTo(items i) {
        return this.item_name.compareTo(i.item_name);
    }
    //This shorting is used to short price wise
//    public int compareTo(items i){
//        if(this.price>i.price){
//            return 1;
//        } else if (this.price<i.price) {
//            return -1;
//        }
//        return 0;
//    }
//    public int compareTo(items i){
//        if(this.item_id>i.item_id){
//            return 1;
//        } else if (this.item_id<i.item_id) {
//            return -1;
//        }
//        return 0;
//    }
}
public class ComaparatorUsingComparableAssign02 {
    public static void main(String [] arr){
        List<items> ll = new ArrayList<>();
        ll.add(new items(5498425,"Crabs",450));
        ll.add(new items(987678,"Chiken",210));
        ll.add(new items(451245,"Mutton",650));
        ll.add(new items(452845,"Prawn",1200));
        ll.add(new items(78545,"Ilish",1250));
//        System.out.println(ll);
        for(items i:ll){
            System.out.println(i);
        }
        System.out.println("After sort using ");
        Collections.sort(ll);
        for(items i:ll){
            System.out.println(i);
        }
    }
}
