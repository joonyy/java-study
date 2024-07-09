package _02_control_statement;
//메서드
// -객체가 갖는 동작(기능)

//메서드 문법
// 접근 제한자 리턴타입 메서드명(인자 1, 인자 2,...){
//메서드 행위;
//리턴 반환값;}

//static 메서드 : 클래스에 속하는 메서드로, 객체 생성하지 않고 호출 가능.
public class Method {

    public static void main(String[] args) {
        hello();
        System.out.println("sum1의 결과 = "+sum1(10,20));
        System.out.println("sum2의 결과 = "+sum2(15, 25));

        int[] numbers = {10, 20};
        int[] numbers2 = {10,20,30,40};
        System.out.println("mul1의 결과 : "+mul1(15, 25));
        System.out.println("mul2의 결과 : "+mul2(numbers));
        System.out.println("mul2의 결과 : "+mul2(numbers2));

        System.out.println("sum3의 결과 : "+sum3(1,2,3));
        System.out.println("sum3의 결과 : "+sum3(1,2,3,4));

        System.out.println("factorial(3) 결과 : "+factorial(3));
        System.out.println("factorial(5) 결과 : "+factorial(5));

    }

    //1. 반환값이 없는 메서드
    public static void hello(){
        System.out.println("안녕 자바!");
    }

    //2. 반환값이 있는 메서드
    // - 객체 타입과 return 키워드에 실제 반환하는 데이터 형식이 일치해야 한다.
    public static int sum1(int x, int y){
        return x + y;
    }
    public static String sum2(int x, int y){
        return "x+y = " + (x + y);
    }
    //메서드에서 매개변수에 전달하는 방식
    //i) call by value(값을 전달하는 방식)
    public static int mul1(int x, int y){
        return x * y;
    }
    //ii) call by reference(참조를 전달하는 방식)
    public static int mul2(int[] nums){
        //return nums[0] * nums[1];
        //배열의 길이가 2보다 길 수 있으므로
        int result = 1;
        for (int n: nums) {
            result *=n;
        }
        return result;
    }

    //가변 인자(Var args) : 메서드 호출 시 넘겨줄 인자의 개수를 동적으로 지정할 수 있게 해주는 기능
    //문법 : 타입... 변수명.
    //가변 인자는 메서드의 마지막 파라미터로 사용  가능
    //하나의 메서드에는 하나의 가변인자만 사용 가능.
    public static int sum3(int... nums){
        int sum = 0;
        for (int n: nums) {
            sum+=n;
        }
        return sum;
    }

    //재귀 메서드 : 자기 자신을 호출하는 메서드
    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

    //메서드 오버로딩
    //
}
