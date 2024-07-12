package _05_class.inheritance;

public class Student extends Person {
//1) 필드가 public인 경우
//    public String campus;
//
//    public Student(String name, int age){
//        //case1.
//        super();//생략 가능. 컴파일 시 자동생성됨.
//        System.out.println("자식 클래스 public Student(String name, int age) 실행");
//
//        this.name = name;
//        this.age = age;
//        //case2.
////        super(name, age);
////        System.out.println("자식 클래스의 public Student(String name, int age) 생성자가 실행되었습니다.");
//    }
//    public void setCampus(String campus){
//        this.campus = campus;
//        System.out.println((campus + "에서 공부중입니다."));
//    }

    //2.) field가 private인 경우
    private String campus;
    public Student(String name, int age){
        //부모에게 상속받은 필드의 값을 변경.
        //- 각 필드가 private이기 때문에, 간접적으로 수정.
        setName(name);
        setAge(age);
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
