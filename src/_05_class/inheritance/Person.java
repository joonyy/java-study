package _05_class.inheritance;

//슈퍼 클래스(부모 클래스) Person;
//서브 클래스(자식 클래스) Student;
public class Person {
    public String name;
    public int age;

    //case1. 부모 클래스가 "기본 생성자"를 갖는 경우.
    public Person(){
        System.out.println("기본 생성자가 실행됩니다!");
    }

    //case2. 부모 클래스가 "매개변수를 갖는 생성자"를 갖는 경우.
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("부모 클래스인 public Person(String name, int age) 생성자가 실행되었습니다.");
//    }

    public void say(){
        System.out.println("안녕하세요!");
    }

    public void eat(String food){
        System.out.println(food + "를 먹고 있다.");
    }

}
