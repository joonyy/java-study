package _05_class._abstract;

public class Square extends Shape{

    public Square(String color){
        super(color);
    }

    @Override
    void draw() {
        System.out.println("사각형을 그려보자~");
    }
}
