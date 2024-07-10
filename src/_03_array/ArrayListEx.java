package _03_array;

// *컬렉션이란(Collection Framework)
// - 객체를 효율적으로 추가/삭제/검색할 수 있도록 관련 인터페이스, 클래스를 java.util패키지에 포함시켜 놓은 것.

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용되는 컬렉션!
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용함.
// - 동적 할당이 가능하다!(미리 크기를 지정하지 않아도 된다! 일반 배열과 결정적으로 다른 점.
// - List 컬렉션은 객체 자체를 저장하는 것이 아닌, 객체의 참조값을 저장한다.
//      -> 동일 객체를 중복저장할 수 있다.
//      -> Null도 저장할 수 있다.
public class ArrayListEx {
    //        1) List<E> list = new ArrayList<E>(); -> 제너릭.

//        도형 shape = new 삼각형(); // 다양한 도형으로 받을 수 있음.
//        삼각형 shape = new 삼각형(); // 오로지 삼각형만 받을 수 있다.

    //2) List<E> list = new ArrayList<>();
    //1번의 간소화된 문법.

    //3) List list = new ArrayList();
    //모든 타입의 객체를 저장 => 타입 안정성이 보장되지 않음.


    //참고) ArrayList<E> list = new ArrayList<E>();
    // 같은 결과를 의미하지만, List를 이용하여 ArrayList를 생성하면 다형성을 가지므로, 유연하다!
    // 다형성 : 하나의 객체가 여러 타입을 가짐.
    //애지간하면 List list = 이렇게 하자.

    public static void main(String[] args) {
        //1. ArrayList 생성 (정수형 요소를 저장하는 예제)
        List<Integer> numbers = new ArrayList<>();

        //2. 요소 추가하기
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //3. 요소 접근하기
        System.out.println("첫번째 요소 : " + numbers.get(0));

        //4. 요소 수정하기
        numbers.set(1, 77);
        System.out.println("numbers : " + numbers);
        System.out.println(Arrays.toString(numbers.toArray()));

        //5. 요소 삽입.
        numbers.add(1, 7);
        System.out.println("numbers : " + numbers);

        //6. ArrayList끼리 연결
        System.out.println(Arrays.asList(100,99,98));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(100,99,98));
        numbers.addAll(numbers2);
        System.out.println("numbers = "+ numbers);

        //7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(100));
        System.out.println(numbers.indexOf(5)); // -1 : 존재하지 않는다!

        //8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers = " + numbers);

        //9. 리스트의 크기 확인 -> size라는 메서드로 꺼내와야 한다! 속성이 아니므로 배열처럼 .length로 꺼내오면 안된다.
        System.out.println("size of numbers = "+ numbers.size());

        //10. 모든 요소 출력
        for(Integer n : numbers) {
            System.out.println("n : "+ n);
        }
        //11. 요소 포함여부 확인
        System.out.println("요소 확인 : "+ numbers.contains(7));
        System.out.println("요소 확인 : "+ numbers.contains(77));

        //12. 모든 요소 삭제
        numbers.clear();
        ///////////////////////////////////////////
        //Student 타입의 ArrayList 생성.
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("John",10));
        students.add(new Student("Jenny",11));
        students.add(new Student("Rose",12));
        students.add(new Student("Lily",13));
        students.add(new Student("Say",14));

        System.out.println("students = "+students);
        System.out.println("size of students = "+students.size());
        Student std1 = students.get(0);
        System.out.println(std1.getName() + "학생의 나이는 "+ std1.getAge() +"살 입니다.");

        System.out.println("=== 학생 명단 ===");
        for (Student std: students) {
            System.out.println(std.getName() + "(" + std.getAge() + ")");
        }
        students.remove(2);
        System.out.println(students);

        students.remove(2);
        System.out.println(students);
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //객체를 문자열로 표현할 때 어떻게 출력할지를 정의할 수 있는 기능.
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}