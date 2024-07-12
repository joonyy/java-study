package _05_class._interface._02;

// 상수 인스턴스 패턴
interface Constants {
    // final 키워드
    // - 클래스에서 사용: 상속될 수 없음. ex. final class MyClass {...}
    // - 메소드에서 사용: 오버라이드 될 수 없음
    // - 변수에서 사용: 값 변경 불가능, 상수가 됨
    // - 매개변수에서 사용: 매개변수 값 변경 불가능 ex. void func(final int x) {...}

    public final int MAX_VALUE = 100;
    double PI = 3.14;
}

class ConstantsEx implements Constants {
    void display() {
        System.out.println("MAX Value: " + MAX_VALUE);
        System.out.println("PI: " + PI);
    }
}

public class InterfaceEx03 {

    public static void main(String[] args) {
        ConstantsEx obj = new ConstantsEx();
        obj.display();
    }
}