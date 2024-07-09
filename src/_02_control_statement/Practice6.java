package _02_control_statement;

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("반지름이 5인 원의 넓이 : "+Area(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : "+Area(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : "+Area(6,3,"삼각형"));
    }
    public static double Area(int r){
        return r * r * Math.PI;
    }
    public static double Area(int a, int b){
        return a * b;
    }
    public static double Area(int a, int b, String c){
        return a * b * 0.5;
    }
}
