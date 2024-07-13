package _08_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // 키는 id, 값은 name 인 HashMap

        Map<Integer, String> map = new HashMap();

        // 객체 저장
        map.put(1001, "홍길동");
        map.put(1002, "성춘향");
        map.put(1003, "김민지");
        map.put(1004, "강해린");

        System.out.println(map);
        System.out.printf("총 %d 명의 학생이 있습니다. %n%n", map.size());

        // 키로 값 얻기
        int key = 1003;
        System.out.printf("%d 번에 해당하는 학생은 %s 이다. %n%n", key, map.get(key));

        // 키와 값으로 구성된 모든 Entry 객체를 Set 에 담아 리턴
        Set<Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println();

        // Iterator 로 순회
        Iterator<Entry<Integer, String>> it = entrySet.iterator();
        while(it.hasNext()) {
            Entry<Integer, String> entry = it.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s 학생은 %d 번 입니다.%n", v, k);
        }
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값 얻으
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        // 주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제되었습니다. %n", deletedValue);
        System.out.printf("현재 %d 명의 학생이 남아있습니다 %n", map.size());
        System.out.println(map);
    }
}