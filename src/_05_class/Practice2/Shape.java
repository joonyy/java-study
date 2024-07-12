package _05_class.Practice2;

public abstract class Shape {
    public String color;
    public String type;

    Shape(String color, String type){
        this.color = color;
        this.type = type;
    }

    public abstract double calculateArea();
    public String getColor(){
        return this.color;
    }
}
