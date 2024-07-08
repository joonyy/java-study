package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //if-else
        int number = 10;
        if(number % 2 == 0){
            System.out.printf("숫자 %d은(는) 짝수입니다.\n", number);
        }else{
            System.out.printf("숫자 %d은(는) 홀수입니다.\n", number);
        }

        //문자열(String)의 객체 비교
        System.out.println("이름을 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();// 엔터 전까지의 문자열을 읽는다.
        System.out.println("name = "+ name);

        //Bad Case!
//        System.out.println(name);
//        if(name == "코딩온"){// 코딩온을 올바르게 입력해도 else로 넘어간다!
//            System.out.println("코딩온 님 환영합니다.");
//        }else{
//            System.out.println("이름을 다시 확인해주세요...");
//        }
        //Good Case!
        if(name.equals("코딩온")){// 코딩온을 올바르게 입력해도 else로 넘어간다!
            System.out.println("코딩온 님 환영합니다.");
        }else{
            System.out.println("이름을 다시 확인해주세요...");
        }

        //이유;
        // '==' 연산자 : 두 객체의 참조를 비교(동일한 메모리 위치를 가리키는지 확인)
        // '.equals()' 메서드 : 두 객체의 "내용"이 같은지 비교

        //"문자열 리터럴"의 경우, 자바에서 특별한 취급을 함.
        //동일한 문자열이 사용될 경우, Java 컴파일러가 문자열 풀(string pool)이라는 공유된 메모리 영역에 해당 문자열을 저장한다.
        String str1 = "hello";
        String str2 = "hello";
        //변수 str1과 str2는 같은 문자열을 가리키고 있으므로 "같은 참조"를 가리킨다.
        if(str1 == str2){// 참조값이 같구나!
            System.out.println("같은 참조값을 가리킵니다.");//출력!
        }else{
            System.out.println("다른 참조값을 가리킵니다.");
        }

        //문자열 동적할당으로 새로운 문자열 객체를 만들면, 서로 다른 객체를 가리키게 된다!
        String str3 = new String("hi");
        String str4 = new String("hi");
        if(str3 == str4){// 참조값이 같구나!
            System.out.println("같은 참조값을 가리킵니다.");
        }else{
            System.out.println("다른 참조값을 가리킵니다."); // 출력!
        }
        //만약 str3, str4의 내용을 비교하고 싶다? => equals 메서드를 쓰세요.
        if(str3.equals(str4)){
            System.out.println("내용이 같습니다.");//출력!
        }else{
            System.out.println("내용이 다릅니다.");
        }

        //if-else if
        //top-down 방식으로, 처음 조건식이 참이라면 뒤의 식은 실행하지 않음.
        if(number %3 == 0){
            System.out.println("3의 배수군요!");
        }else if(number%5 == 0){
            System.out.println("5의 배수군요!");
        }else{
            System.out.println("3의 배수도, 5의 배수도 아님.");
        }

        //switch case문
        String DayOfWeek;
        int day = 4;
        switch(day) {
            case 1 :
                DayOfWeek = "일요일";
                break;
            case 7 :
                DayOfWeek = "토요일";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                DayOfWeek = "평일";
                break;
            default:
                DayOfWeek = "잘못된 입력";
                break;
        }
        System.out.printf("오늘은 %s 입니다.", DayOfWeek);
    }
}
