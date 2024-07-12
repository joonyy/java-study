package _05_class.Practice2;

import java.util.SortedMap;

public class ShapeEx {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 6,4);
        displayInfo(circle);
        displayInfo(rectangle);
    }

    public static void displayInfo(Shape shape){
        System.out.println("===" + shape.type+" 도형의 정보 ===");
        System.out.println("도형의 색상 : "+ shape.color);
        System.out.println("도형의 넓이 : "+ shape.calculateArea());
    }
}
