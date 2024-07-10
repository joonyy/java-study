package _04_exception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleCatchEx {
    public static void main(String[] args) {
        Scanner scanner = null;

        try{
            scanner = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 :");
            //String타입으로 입력받은 뒤,
            String input = scanner.nextLine();

            //문자열을 정수로 변환
            int number = Integer.parseInt(input);//NumberFormatException 예외 발생 가능성 있음.

            //입력 받은 숫자를 나눌겁니다.
            int dividedResult = 100/number; // ArithmeticException 예외 발생 가능성

            //결과값 출력.
            System.out.println("숫자 100을 "+ number+" 로 나눈 결과 = "+ dividedResult);

            //배열에 접근 시도
            int[] array = new int[5]; // [0,0,0,0,0]
            array[number] = 10;
            System.out.println(number + "인덱스의 값을 10으로 수정하였습니다." + Arrays.toString(array));
        }catch(NumberFormatException e){
            System.out.println("[ERROR] 숫자 형식이 잘못되었습니다 : "+ e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("[ERROR] 0으로 나눌 수 없습니다 : "+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("[ERROR] 배열 인덱스가 범위를 벗어납니다. : " + e.getMessage());
        }catch(Exception e){
            //그냥 Exception : general Exception handler
            // - 예상하지 못한 예외, 명시적으로 처리하지 않은 예외를 잡는 "마지막 방어선"
            // - 일반적으로 가장 마지막 catch절로 사용합니다.
            System.out.println("[ERROR] 알 수 없는 예외가 발생했습니다. : "+e.getMessage());
        }finally {
            System.out.println("프로그램을 종료합니다.");
            if(scanner!=null) {
                scanner.close();
            }
        }


    }
}
