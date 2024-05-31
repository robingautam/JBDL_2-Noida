package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        List<Integer> ans = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            int val = list.get(i);
            if (val%2==0){
                ans.add(val);
            }
        }

        System.out.println(ans);

        ans = list.stream().filter(i->i%2==0).collect(Collectors.toList());

       // System.out.println(ans);

    }
}
