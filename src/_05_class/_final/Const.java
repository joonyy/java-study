package _05_class._final;

// 상수
// - 불변의 상수 값
// - 객체마다 저장할 필요가 없는 공용성을 갖는 static 과
//      초기값이 저장되면 변경 불가능한 final 특성을 가져야 함
// - 대문자로 작성하는 것이 관례 (여러 단어 혼합시 언더스코어로 연결)
public class Const {
    //정수형 상수 선언
    public static final int MAX_VALUE = 100;

    //문자열 상수 선언
    public static final String GREETING = "Hello world!";

}
