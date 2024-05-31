package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapImpl {

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        String s = "yeuwhhsgghs";

        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
       // int val = map.get('z');
        //System.out.println(val);
        for (char k: map.keySet()){
            //System.out.println(k+" :"+map.get(k));
        }

        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(5);
        }*/

        CopyOnWriteArrayList<Integer> cp = new CopyOnWriteArrayList<>();
        cp.add(1);
        cp.add(2);

        Iterator<Integer> itr = cp.iterator();
        int count =0;
        while (itr.hasNext()){
            count++;
            System.out.println(itr.next());
            if (count==2){
                cp.add(4);
            }
        }
    }
}
