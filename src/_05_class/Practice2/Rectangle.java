package _05_class.Practice2;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(String color, double width, double height){
        super(color,"Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
