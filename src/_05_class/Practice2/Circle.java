package _05_class.Practice2;

public class Circle extends Shape{
    public double radius;
    public Circle(String color, double radius){
        super(color,"Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
