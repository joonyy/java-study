package _04_exception;

//예외
//일반 예외(Exception) : 컴파일러가 예외처리 코드 여부를 검사하는 예외
//      -> 개발자가 예외처리를 해줘야 함.
//실행 예외(Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외
//      -> 예외처리 하는걸 권장.

import java.util.InputMismatchException;
import java.util.Scanner;

//Java는 예외가 발생하면 예외 클래스로터 예외 객체를 생성하며, 해당 객체는 예외 처리 시에 사용된다.
//예외처리 코드란? : 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드.
// try-catch-finally로 구성.

//try 블럭에서 작성한 코드가 예외없이 정상 실행 => catch 블록 실행 X & finally 블록 실행
//
//try 블럭에서 예외 발생 => catch블록 실행 & finally 블록 실행.
// =>즉, finally 블록은 항상 실행된다.
// =>try블록과 catch 블록에서 return문을 사용해도 finally절은 항상 실행되며, 옵션이므로 생략도 가능함.
//
//다중 catch 블록 사용하기 => 여러 유형의 예외를 처리할 수 있다.

public class ExceptionEx {
    public static void main(String[] args) {
        //case1. 예외 발생 코드
        System.out.println(divide(6,2));
        //case1. 예외처리 코드
//        System.out.println(divide(6,0));//ArithmeticException

//        //case1. 예외 처리 코드
//        try{
//            System.out.println("***연산 시작! ***");
//            System.out.println(divide(6,0));
//        }catch (ArithmeticException e){
//            //방법 1. e.getMessage() => 예외가 발생한 이유만 보여준다!
////            System.out.println("나누기 연산 중 에러가 발생 : "+ e.getMessage());
//            //방법 2. e.toString()
////            System.out.println("나누기 연산 중 에러가 발생 : "+ e.toString());
//            //방법 3. e.printStackTrace() : 예외가 어디서 발생했는지 추적한 내용 출력
////            e.printStackTrace();
//        }finally {
//            System.out.println("**연산이 종료되었습니다.**");
//        }
        //case2. 예외발생 코드
        /*
        System.out.println("단어 길이 : " + getLength(new String("Hello, world!")));
        System.out.println("단어 길이 : " + getLength(new String("")));
//        System.out.println("단어 길이 : " + getLength(null)); // NullPointerException
        try{
            System.out.println("단어 길이 : " + getLength(null)); // NullPointerException
        }catch(NullPointerException e){
            System.out.println("단어길이 연산 중 에러 발생 >> "+ e.toString());
        }*/

        //case3. 예외 발생 코드
        /*
        int[] numbers = {10,20,30,40,50};
        System.out.println(getValuebyIndex(numbers,1));

        //case3. 예외처리 코드
        try{
            System.out.println(getValuebyIndex(numbers, numbers.length));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱싱 중 에러 발생 >> "+e.toString());
        }
*/

        //case 4.
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수를 입력해주세요 : ");
            int number = scanner.nextInt(); // 공백 이전의 정수형 받음.
            System.out.println("입력한 정수 : " + number); //InputMismatchException
        }catch(InputMismatchException e){
            System.out.println("입력값을 확인하고 정수를 입력해주세요! "+ e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public static String divide(int x , int y){
        return x + " / " + y + " = " + (x / y);
    }

    public static int getLength(String str) { return str.length(); }

    public static int getValuebyIndex(int[] arr, int idx){return arr[idx];}
}