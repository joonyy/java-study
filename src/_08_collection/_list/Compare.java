package _08_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs. LinkedList
public class Compare {
    public static void main(String[] args) {
        List<String> li1 = new ArrayList<>();
        List<String> li2 = new LinkedList<>();

        // 시작, 끝 시각을 의미하는 변수 선언
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            li1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            li2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간: " + (endTime - startTime));

//        ArrayList 소요 시간: 11188042
//        LinkedList 소요 시간: 2539584

        // 결과 해석
        // - LinkedList 가 요소 추가 작업에 대해 더 빠른 성능을 냄
        // - ArrayList 는 0 번 인덱스에 새로운 요소를 추가하면서 기존 요소 인덱스를 한칸씩 뒤로 미루는 작업을 하기 때문
    }
}