package _05_class.Practice;

import java.lang.Math;
public class Circle {
    private final double radius;
    static final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return PI * radius * radius;
    }
}
