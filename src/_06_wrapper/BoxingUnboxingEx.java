package _06_wrapper;

//Wrapper 객체
// - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 가지는 객체를 생성한다.
// -
public class BoxingUnboxingEx {
    public static void main(String[] args) {
        //Boxing
        //- 기본 타입 값을 포장 객체로 만드는 과정을 의미.
        //- 포장 클래스 변수에 값이 대입될 때 발생.
        Integer obj1 = 12;
        Double obj2 = 3.14;
        Character obj3 = 'A';
        //primitive 타입이 아니므로, 위 객체들은 Boxing이 일어나게 된다.
        System.out.println("obj1 = " + obj1.intValue());
        System.out.println("obj2 = " + obj2.doubleValue());
        System.out.println("obj3 = " + obj3.charValue());
        // 자료Value() : 명시적 언박싱
        // - 객체 값이 null일 때, 자동 언박싱은 NullPointerException 을 발생시킬 수 있지만,
        // - 자료형Value() 메서드로 사용 하면 명확한 에러 처리가 가능함.

        //Unboxing
        //- 포장 객체에서 기본 타입 값을 얻는 과정.
        //- 기본 타입 변수에 포장 객체가 대입될 때 발생.
        int value1 = obj1;
        double value2 = obj2;
        char value3 = obj3;

        System.out.println("value1 = "+ value1);
        System.out.println("value2 = "+ value2);
        System.out.println("value3 = "+ value3);

        //연산 괴정에서의 언박싱
        int result1 = obj1 + 100;
        double result2 = obj2 + 1.5;
        char result3 = (char) (obj3 + 1);
        // char c1 = 'A'; (문자 리터럴) // char c1 = 65; (아스키코드) // char c1 = '\u0041'; (유니코드)
        }
}
