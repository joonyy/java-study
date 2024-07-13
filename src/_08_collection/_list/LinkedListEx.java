package _08_collection._list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);

        // 첫번째와 마지막 위치에 요소 추가
        // - addFirst(), addLast() 메서드는 LinkedList 에 특화된 메서드
        list.addFirst("Grape");
        list.addLast("Kiwi");
        System.out.println(list);

        // 특정 위치에 요소 삽입
        list.add(2, "Blueberry");
        System.out.println(list);

        // 첫번째와 마지막 요소 가져오기
        // - getFirst(), getLast() 메서드는 LinkedList 에 특화된 메서드
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 요소 삭제
        list.remove("Banana");
        System.out.println(list);

        // 첫번째와 마지막 요소 삭제
        // - removeFirst(), removeLast() 메서드는 LinkedList 에 특화된 메서드
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println(list);
        System.out.println(first);
        System.out.println(last);

        // 요소 검색
        System.out.println("Cherry 가 포함되어 있나요? " + list.contains("Cherry"));
        System.out.println("Apple 가 포함되어 있나요? " + list.contains("Apple"));

        // LinkedList 순회
        for(String f: list) {
            System.out.println(f);
        }

        // LinkedList 크기
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}