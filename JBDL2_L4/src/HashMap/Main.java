package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
       /* HashMap<String,Integer> map = new HashMap<>();
        map.put("robin",1);
        map.put("robin",2);

        System.out.println(map.size());*/

        Student s1 = new Student(1,"Robin","robin@gmail.com");
        Student s2 = new Student(2,"aakash","robin@gmail.com");

        Student s3 = new Student(1,"Robin","robin@gmail.com");

        System.out.println(s1.equals(s3));

        HashMap<Student,Integer> map  = new HashMap<>();
        map.put(s1,1);
        map.put(s2,2);
        map.put(s3,3);

        System.out.println(map.size());

        Set<Integer> set = new HashSet<>();
        set.add(2);

    }
}
