package _07_generic;

// 사람 관련 객체 사이의 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//      ㄴWebStudent
//      ㄴMobileStudent

class Person{}

class Teacher extends Person{}
class Student extends Person{}
class WebStudent extends Student{}
class MobileStudent extends Student{}

//등록
//특정 종류(T)의 Applicant를 나타내는 클래스!
class Applicant<T>{
    public T kind;
    public Applicant(T kind){this.kind = kind;}
}

//과정
class Course{
    // ? : 모든 사람이 등록 가능.
    public static void registerA(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course A를 등록함");
    }
    //extends Student :Student 객체만 등록 가능.
    public static void registerB(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course B를 등록함");
    }

    //super Teacher : Teacher 혹은 Student가 아닌 Person만 등록 가능!
    public static void registerC(Applicant<? super Teacher> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course C를 등록함");
    }

    // 참고. getClass(), getSimpleName() 메서드
    // - Object 클래스에서 제공되는 메서드
    // - getClass(): 객체 클래스 정보 반환, 반환 값이 클래스 객체 (ex. class java.lang.String)
    // - getSimpleName(): Class 클래스의 메소드 클래스의 간결한 이름 반환, 패키지 정보를 제외한 클래스이름만 얻어올 때 사용

}
public class GenericEx03 {
    public static void main(String[] args) {
        //A
        Course.registerA(new Applicant<Person>(new Person()));
        Course.registerA(new Applicant<Teacher>(new Teacher()));
        Course.registerA(new Applicant<Student>(new Student()));
        Course.registerA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerA(new Applicant<MobileStudent>(new MobileStudent()));
        System.out.println();

        //B
//        Course.registerB(new Applicant<Person>(new Person()));//err
//        Course.registerB(new Applicant<Teacher>(new Teacher()));//err
        Course.registerB(new Applicant<Student>(new Student()));
        Course.registerB(new Applicant<WebStudent>(new WebStudent()));
        Course.registerB(new Applicant<MobileStudent>(new MobileStudent()));
        System.out.println();

        //C
        Course.registerC(new Applicant<Person>(new Person()));
        Course.registerC(new Applicant<Teacher>(new Teacher()));
//        Course.registerC(new Applicant<Student>(new Student()));//err
//        Course.registerC(new Applicant<WebStudent>(new WebStudent()));//err
//        Course.registerC(new Applicant<MobileStudent>(new MobileStudent()));//err
        System.out.println();
    }
}
