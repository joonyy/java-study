package _05_class._access_modifier._pack5;

//단 하나의 객체. singleton.
//애플리케이션에서 하나의 객체를 만들고 싶다면? 싱글톤을 사용하면 된다!
//외부에서 new 연산자로 생성자를 호출 할 수 없다록 막는다!
//생성자를 호출할 수 없으므로, 외부에서 객체 생성 불가능.
//싱글톤이 제공하는 정적 메소드를 통해 간접적으로 객체를 얻을 수 있다.
public class Singleton {
    //private 접근 권한을 갖는 필드 선언 및 초기화
    // 객체 생성.
    private static Singleton singleton = new Singleton();

    //private 접근권한을 갖는 생성자 선언. -> 이 클래스 내부에서만 객체 선언이 가능.
    private Singleton(){}

    //public 접근권한을 갖는 정적 메서드 선언
    public static Singleton getSingleton(){return singleton;}

}
