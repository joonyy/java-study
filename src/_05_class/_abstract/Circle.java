package _05_class._abstract;

//실체 클래스
public class Circle extends Shape{

    public Circle(String color){
        super(color);
    }

    //추상 메서드를 재정의하는 행위
    @Override
    void draw() {
        System.out.println("원을 그려보자~");
    }
}
