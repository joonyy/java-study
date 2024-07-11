package _05_class._access_modifier._pack3;

public class B {
    public void method(){
        A a = new A(); // 같은 패키지에 있으므로 조건없이 import 가능!

        //필드 변경
        a.field1 = 1;
        a.field2 = 2;
//      a.field3 = 3; // private 필드이므로 에러 발생.

        //메서드 호출
        a.method1();
        a.method2();
//      a.method3(); // private이므로 컴파일 에러.
    }
}
