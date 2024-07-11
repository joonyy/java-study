package _05_class._access_modifier._pack4;
//서로 다른 패키지면 import문이 필수.
import _05_class._access_modifier._pack3.A;

public class C {
    public  void method(){
        A a = new A();
        a.field1 = 4;
//        a.field2 = 5; // default 필드 : 컴파일 에러.
//        a.field3 = 5; // private 필드 : 컴파일 에러.
        a.method1();
//        a.method2(); // default 필드 : 컴파일 에러.
//        a.method3(); // private 필드 : 컴파일 에러.

    }

}
