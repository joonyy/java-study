package _05_class._abstract;

//추상 클래스
//- 클래스의 공통적 필드, 메서드를 추출하여 선언한 클래스
//- 실체 클래스 : 객체를 직접 생성할 수 있는 클래스
//- 추상 클래스 : 공통적인 특성을 추출해서 선언한 클래스

//abstract 키워드를 사용한다면?
//new 연산자로 객체 생성 불가능.
// => 직접 생성자 호출이 불가능한 것이지, 자식 클래스의 생성자에서 super()를 통해 추상 클래스 객체를 생성할 수는 있다.
//상속을 통해 자식 클래스만 만들 수 있음.
public abstract class Shape {
    //필드 가질 수 있음!
    String color;

    //생성자
    public Shape(String color){
        this.color = color;
    }

    //추상 메서드
    //- 메서드의 선언부만 있는 메서드
    //- 자식 클래스에서 재정의(@override)
    //- 모든 실체들이 갖는 메서드 실행 내용이 동일하다면, 추상 클래스에서 메서드를 구현 나옴.
    //- 메서드의 선언만 통일하고 실제 내용이 달라져야 한다면, 추상 메서드를 사용!
    //- 자식 클래스는 추상 메서드를 재정의하지 않으면 컴파일 에러 발생.

    abstract void draw();

    void start(){
        System.out.println("도형을 그려보자~");
    }

    public String getColor() {
        return color;
    }
}
