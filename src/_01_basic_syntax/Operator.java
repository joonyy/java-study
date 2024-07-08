package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;
        //대입 연산자 =
        x = 10; y=20;
        a = 5.0f; b = 10.0f;

        //산술 연산자 +-*/
        System.out.println("===x,y===");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("x+y = "+ (x+y));
        System.out.println("x-y = "+ (x-y));
        System.out.println("x*y = "+ (x*y));
        System.out.println("y/x = "+ (y/x));
        System.out.println("x%y = "+ (x%y));

        System.out.println("===a,b===");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+ (a+b));
        System.out.println("a-b = "+ (a-b));
        System.out.println("a*b = "+ (a*b));
        System.out.println("b/a = "+ (b/a));
        System.out.println("a%b = "+ (x%b));

        //증감 연산자
        System.out.println("===증감 연산자===");
        System.out.println("x++ = "+ x++ + x);//후위 증가
        System.out.println("++x = "+ ++x);//전위 증가
        System.out.println("x-- = "+ x--);//후위 감소
        System.out.println("--x = "+ --x);//전위 감소

        //산술적인 대입 연산자
        System.out.println(x);
        System.out.println("x += 5 : " +(x+=5) );
        System.out.println("x -= 5 : " +(x-=5) );
        System.out.println("x *= 5 : " +(x*=5) );
        System.out.println("x /= 5 : " +(x/=5) );
        System.out.println("x %= 5 : " +(x%=5) );

        //비교 연산자 : 연산 결과가 Boolean(true/false)
        System.out.println("===비교 연산자===");
        System.out.println("a>b >> " + (a>b));
        System.out.println("a>b >> " + (a>=b));
        System.out.println("a>b >> " + (a<b));
        System.out.println("a>b >> " + (a<=b));
        System.out.println("a>b >> " + (a==b));
        System.out.println("a>b >> " + (a!=b));

        //논리 연산자 : 연산 결과가 boolean
        boolean j = true;
        boolean k = false;
        boolean l = true;
        System.out.println("===비교 연산자===");
        System.out.println("j && k = " + (j&&k));
        System.out.println("j && l = " + (j&&l));
        System.out.println("j || k = " + (j||k));

        //삼항연산자
        System.out.println("=== 삼항 연산자 ===");
        System.out.println(x>y ? "x는 y보다 큼":"x는 y보다 크지 않음.");
    }
}
