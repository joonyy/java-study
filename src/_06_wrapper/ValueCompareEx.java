package _06_wrapper;

//포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 ==, != 사용 불가능.
// - 내부 값을 비교하는게 아닌, Wrapper클래스 객체의 참조값을 비교하기 때문.
// - 따라서, equals() 메서드로 내부 값을 비교해야 한다.

// - byte, short, int : -128~127
// - boolean : true , false
// - char \u0000~ \u007f
// - 위 범위에 요청되는 값은 같은 객체를 공유하기 때문에, 같은 참조를 가진다. 이 외에는 다른 참조.
public class ValueCompareEx {
    public static void main(String[] args) {
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.println(obj1 == obj2); // true
        System.out.println(obj1.equals(obj2)); // true

        Integer obj3 = 1000;
        Integer obj4 = 1000;
        System.out.println(obj3 == obj4); // false -> 참조값 비교
        System.out.println(obj3.equals(obj4)); //true => 내용 비교

        Boolean bool1 = true;
        Boolean bool2 = true;
        System.out.println(bool1 == bool2); // true
        System.out.println(bool1.equals(bool2)); //true

        Character char1 = 'A';
        Character char2 = 'A';
        System.out.println(char1 == char2);//true
        System.out.println(char1.equals(char2));//true

        Character char3 = '\u0101';
        Character char4 = '\u0101';
        System.out.println(char3 == char4);//false
        System.out.println(char3.equals(char4));//true
    }
}
