package _05_class.Practice;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        Circle C1 = new Circle(radius);
        System.out.println("원의 반지름 : "+ radius);
        System.out.println("원의 넓이 : "+ C1.calculateArea());
    }
}
