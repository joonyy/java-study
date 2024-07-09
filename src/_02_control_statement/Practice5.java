package _02_control_statement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("덧셈 결과 : %.1f\n", a+b);
        System.out.printf("뺄셈 결과 : %.1f\n", a-b);
        System.out.printf("나눗셈 결과 : "+ a/b+'\n');
        System.out.printf("곱셈 결과 : %.1f", a*b);
    }
}
