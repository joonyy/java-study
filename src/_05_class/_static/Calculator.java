package _05_class._static;

// 정적(static) 멤버
// - 객체를 생성할 필요 없이 클래스를 통해 바로 접근 가능
// - 클래스가 메모리에 로딩되면 정적 멤버 바로 사용 가능
// - 클래스 이름과 함께 dot(.) 연산자 접근 가능
// - 객체 자신의 참조인 this 도 사용 불가능!

// 참고)
// - static field 는 객체 생성 없이도 사용 가능 -> 생성자에서 초기화 작업 필요 x
// -> 왜냐하면, 생성자는 객체 생성 후에 실행되기 때문
public class Calculator {

    // static field
    static double pi = 3.141592; // 어떤 계산기든 파이 값은 언제나 동일하므로 static 선언

    // static method
    // - plus, minus 외부에서 주어진 값으로 처리므로 정적 메서드로 처리하는 것이 유리
    // - 메소드의 매개변수가 인스턴스 필드를 이용하지 않으므로!
    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }

}