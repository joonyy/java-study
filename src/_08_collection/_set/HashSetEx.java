package _08_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("apple");
        set1.add("orange");
        set1.add("banana");
        set1.add("banana");//set은 중복이 허용되지 않는다!
        System.out.println(set1);

        System.out.printf("총 %d 종류의 과일이 있습니다.\n", set1.size());

        /////////////////////////////
        Set<Course> set2 = new HashSet<>();

        Course java = new Course(121, "Java");
        Course js1 = new Course(112, "JavaScript");
        Course js2 = new Course(111, "JavaScript");
        System.out.println(java.hashCode());
        System.out.println(js1.hashCode());
        System.out.println(js2.hashCode());
        System.out.println(js1.equals(js2));

        set2.add(java);
        set2.add(js1);
        set2.add(js2);
        System.out.println(set2);

        System.out.printf("총 %d 종류의 과정이 있습니다. ", set2.size());

        for(Course c : set2){
            System.out.println(c);
        }
        //case2. iterator()메서드로 반복자를 얻어 객체 하나씩 가져오기
        Iterator<Course> it = set2.iterator();
        while(it.hasNext()){
            Course c= it.next();
            System.out.println(c);
        }
    }
}
