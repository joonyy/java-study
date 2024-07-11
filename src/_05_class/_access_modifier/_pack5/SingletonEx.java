package _05_class._access_modifier._pack5;

public class SingletonEx {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton(); //Singleton 클래스의 생성자가 private이므로 컴파일 에러 발생.

        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        if(s2 == s3){//참조값 비교.
            System.out.println("같은 객체입니다.");
            System.out.println(s2);
            System.out.println(s3);
        }else {
            System.out.println("다른 객체입니다.");
        }
    }
}
