package collections;

import java.util.*;

public class ListImpl {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,5);



       // System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);

      /*  System.out.println(set.contains(3));
       // set.clear();
        System.out.println(set.isEmpty());

        System.out.println(set);
        set.remove(2);
        System.out.println(set);*/


      /*  TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(1);

        System.out.println(treeSet);*/

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
        System.out.println(queue.peek());


    }
}
