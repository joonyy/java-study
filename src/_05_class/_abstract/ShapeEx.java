package _05_class._abstract;

public class ShapeEx {
    public static void main(String[] args) {
//        Shape shape = new Shape("green"); //직접 생성 불가.
        //자식 클래스(실체 클래스)인 Circle, Square 는 new 연산자로 객체 생성 가능.
        Circle circle = new Circle("blue");
        Square square = new Square("yellow");

        //매개변수의 다형성
        // : go 메서드의 매개타입이 Shape지만, 각각이 실체 클래스로 자동으로 타입 변환.
        go(circle);
        go(square);
    }

    public static void go(Shape shape) {
        shape.start();
        shape.draw();
        System.out.println("도형의 색상은 : "+shape.color+'\n');
    }
}
