package _02_control_statement;

import java.util.*;
public class LoopControl {

    public static void main(String[] args) {

        // 1. 기본 for 문
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while 문
        // - 조건식이 참일 동안 while 블럭 실행
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 3. do-while 문
        // - 무조건 최소 한 번은 do 블럭이 실행되는 반복문
        // - while 문과 다르게 조건식이 뒤에 배치
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println();

        // 참고. while vs. do-while
        int k = 5;

        System.out.println("while 문: "); // 조건을 먼저 검사한 후 루프 본문 실행
        while (k < 5) { // 맨 처음 반복부터 false 이기 때문에 루프 본문이 한 번도 실행되지 못함
            System.out.println("k = " + k);
            k++;
        }

        System.out.println("do-while 문: "); // 루프 본문을 먼저 실행한 후에 조건을 검사
        do { // 조건 검사 전에 루프 본문이 한 번 실행
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
        // => 루프 본문이 최소한 한 번은 실행되어야 할 때 사용
        System.out.println();

        // 4. for-each 문 (향상된 for 문)
        // for (데이터타입 변수 : 배열 또는 컬렉션) { ... }
        // *Collection(컬렉션): 데이터를 저장하고 관리하는 자료구조를 제공하는 클래스 모음 (ex. List, Set, Map, Stack, Vector 등)
        // - 간결성: 일반 for 문보다 읽기 쉽다
        // - 오류 발생 가능성 낮음: 인덱스를 사용하지 않으니 인덱스 관련 오류 줄일 수 있음4
        // - 순회 전용: 순차적으로 접근할 때만 사용 가능
        // - 읽기 전용: 반복문 안에서 컬렉션 구조를 변경할 수 없음
        // - 역방향 순회 불가: 항상 처음부터 끝까지 순회
        // => 모든 요소에 대해서 동일한 작업을 할 때 유리 / 인덱스가 필요하거나 특정 조건에서 순회를 중단해야 한다면 일반 for 문이나 while 문 적합
        //case 1. 배열에 대한 for-each문
        String[] array = { "A", "B", "C", "D", "E" };
        for (String a : array) {
            System.out.println("a = " + a);
        }
        System.out.println();

        // for-each 문으로 배열을 순회하는 반복문을 일반 for 문으로 수정한다면?
        // - for-each 문 보다 명시적
        // - 인덱스를 사용할 수 있다
        // - 코드가 길어진다
        for (int x = 0; x < array.length; x++) {
            String a = array[x];
            System.out.println("a = " + a);
        }

        //case2. List 에 대한 for-each 문
        List<String> list = new ArrayList<String>();
        list.add("가");
        list.add("나");
        list.add("다");
        for(String l : list){
        }
    }
}