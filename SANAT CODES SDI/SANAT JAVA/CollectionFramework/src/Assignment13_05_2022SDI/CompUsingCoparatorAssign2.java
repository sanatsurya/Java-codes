package Assignment13_05_2022SDI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class product{
    private int product_code;
    private String product_name;
    private int quantity;
    product(int product_code, String product_name, int quantity){
        this.product_code=product_code;
        this.product_name=product_name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "product{" +
                "product Id=" + product_code +
                ", Name='" + product_name + '\'' +
                ", Quantity=" + quantity +
                '}';
    }

    public int getProduct_code() {
        return product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getQuantity() {
        return quantity;
    }
}
class CompareHere implements Comparator<product>{

//    @Override
//    public int compare(product p1, product p2) {
//        if(p1.getProduct_code()> p2.getProduct_code()){
//            return 1;
//        } else if (p1.getProduct_code()< p2.getProduct_code()) {
//            return -1;
//        }
//        return 0;
//    }
    @Override
    public int compare(product p1, product p2) {
        if(p1.getQuantity()> p2.getQuantity()){
            return 1;
        } else if (p1.getQuantity()< p2.getQuantity()) {
            return -1;
        }
        return 0;
    }
}
public class CompUsingCoparatorAssign2 {
    public static void main(String[]args){
        List<product> l2= new ArrayList<>();
        l2.add(new product(1254,"Lifeboy",55));
        l2.add(new product(1234,"Dettol",1254));
        l2.add(new product(1754,"Santor",2));
        l2.add(new product(1244,"Margo",0));
        l2.add(new product(1284,"Dove",57));
        l2.add(new product(1994,"Wildstone",20));


        for(product p1:l2){
            System.out.println("first"+p1);
        }
        Comparator<product> compare = new CompareHere();
        Collections.sort(l2,compare);
        System.out.println("#########################");
        for(product p: l2){
            System.out.println(p);
        }
    }
}
