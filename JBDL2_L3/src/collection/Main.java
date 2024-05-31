package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(5);
        pq.add(3);

        /*System.out.println(pq.remove());
        System.out.println(pq.remove());*


         */

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);

        Collections.sort(list);
        System.out.println(list);
    }
}
