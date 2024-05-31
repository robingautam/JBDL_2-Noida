package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,2,1,2,3,3);

       /* List<Integer> ans = list.stream().filter(i -> i%2==0).map( (integer) -> integer*integer).collect(Collectors.toList());
        System.out.println(ans);*/

      /*  List<Integer> ans = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ans);*/

        List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);

        boolean num = list.stream().anyMatch(i->i==20);
        System.out.println(num);

       boolean b = list.stream().allMatch(i->i>0);
        System.out.println(b);

    }
}
