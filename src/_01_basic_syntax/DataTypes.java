package _01_basic_syntax;

// Primitive Types (기본형)
// - 사용되기 전에 선언되어야 함
// - OS 에 따라 자료형 길이가 변하지 않음
// - "비객체" 타입 -> null 값을 가질 수 없음

// Reference Type (참조형)
// - java.lang.Object 상속받음
// - 기본형이 아니면 모두 참조형

public class DataTypes {

    public static void main(String[] args) {

        System.out.println("===== Primitive Type ====");

        // 정수형 변수
        int x = 10; // 32bit
        long y = 1000000000L; // 64bit,  long 타입은 뒤에 'L' 혹은 'l'을 붙여야 함
        short z = 32767; // 16bit
        byte b = 127; // 8bit

        // 실수형 변수
        float a = 3.14F; // 32bit, float 타입은 'F' 혹은 'f'를 붙여야 함
        double c = 2.71828; // 64bit

        // 문자형 변수
        char ch = 'A'; // 작은 따옴표를 사용

        // 논리형 변수
        boolean bool = true; // false

        System.out.println("정수형 변수: " + x + ", " + y + ", " + z + ", " + b);
        System.out.println("실수형 변수: " + a + ", " + c);
        System.out.println("문자형 변수: " + ch);
        System.out.println("논리형 변수: " + bool);

        Person person = new Person("준영", 28);
        System.out.println("Person 객체 : "+ person.getName() + ", " + person.getAge());
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}


