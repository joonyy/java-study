package _01_basic_syntax;

// 형변환
// - 데이터 타입을 변환하는 것
// - (type)var
//      - type: 자료형
//      - var: 변수 이름
public class Casting {

    public static void main(String[] args) {

        // 1. 묵시적 형변환 (Wider conversion)
        // - 더 작은 타입에서 더 큰 타입으로 자동 형변환
        // - 반대의 경우는 묵시적 형변환 불가능 -> 명시적으로 변환해야 함
        int smallNum = 10;
        double bigNum = smallNum; // int 를 double 로 자동 형변환

        System.out.println("smallNum = " + smallNum);
        System.out.println("bigNum = " + bigNum);

        // 2. 명시적 형변환 (Narrow conversion)
        // - 더 큰 타입에서 더 작은 타입으로의 강제 형변환
        double anotherBigNum = 20.5;
        int anotherSmallNum = (int) anotherBigNum; // double 을 int 로 강제 형변환
        System.out.println("anotherBigNum = " + anotherBigNum);
        System.out.println("anotherSmallNum = " + anotherSmallNum);

        // 데이터 손실이 발생할 수 있는 경우 주의
        int largeNum = 1000; // 00000000 00000000 00000011 11101000
        byte smallByte = (byte) largeNum; // -128 ~ 127 // int 를 byte 로 강제 형변환 // 11101000 -> 2의 보수 계산법 -> 00011000 (= -24)

        System.out.println("largeNum = " + largeNum);
        System.out.println("smallByte = " + smallByte);

    }

}