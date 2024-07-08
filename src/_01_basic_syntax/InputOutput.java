package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        int amount = 3;
        String product = "코카콜라 제로";

        // 출력 (output)
        System.out.print("안녕하세요,");
        System.out.println("저는 Sean 입니다!");
        System.out.print("잘부탁드립니다!\n");
        // System.out.println();
        System.out.printf("편의점에서 %s 제품을 %d 개 구매했습니다.", product, amount);
        // print(): 여러 개의 출력문이 한 줄로 표시
        // println(): 내용 출력 + 개행
        // printf("출력 서식", 출력 내용);
        // *출력 서식
        // %s(문자열), %d(정수형), %f(실수형), %c(문자형), %b(불리언형), %n(개행)

        // 입력 (input)
        // - Scanner 클래스 이용
        System.out.println("\n\n공백으로 구분해서 이름, 나이, 키, 결혼여부 를 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지의 문자열
        int age = scanner.nextInt(); // 공백 이전까지의 정수
        double height = scanner.nextDouble(); // 공백 이전까지의 실수
        boolean single = scanner.nextBoolean(); // 공백 이전까지의 결혼 여부

        System.out.println("==== 입력 결과 출력 ====");
        System.out.printf("이름\t\t\t: %s (님)\n", name);
        System.out.printf("나이\t\t\t: %d (세)\n", age);
        System.out.printf("키\t\t\t: %.1f cm\n", height);
        System.out.printf("결혼 여부\t: %b\n", single);

        scanner.close();

    }

}