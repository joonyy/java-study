package _05_class.inheritance;

public class Student extends Person {
    public String campus;

    public Student(String name, int age){
        //case1.
        super();//생략 가능. 컴파일 시 자동생성됨.
        System.out.println("자식 클래스 public Student(String name, int age) 실행");

        this.name = name;
        this.age = age;
        //case2.
//        super(name, age);
//        System.out.println("자식 클래스의 public Student(String name, int age) 생성자가 실행되었습니다.");
    }
    public void setCampus(String campus){
        this.campus = campus;
        System.out.println((campus + "에서 공부중입니다."));
    }
}
