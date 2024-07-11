package _05_class._final;

public class ConstEx {
    public static void main(String[] args) {
        //static : 객체생성 없이 접근 가능!
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);

//      final : 변경이 불가함!
//        Const.GREETING = "hi";
//        Const.MAX_VALUE= 12;

    }

}
