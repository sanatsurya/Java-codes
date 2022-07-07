package JavaEight.Steeems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreemTwoEx {
    public static void main(String[] args) {
        int [] nums = {5,7,8,9,11,57,24,15};
        IntStream instream = Arrays.stream(nums);
        instream.forEach(name->{
            System.out.println(name);
        });
        List<String> list1 = List.of("sanat","surya","Raghavendra");
        list1.stream().forEach(n-> System.out.println(n));
    }
}
