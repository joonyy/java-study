package _05_class._interface._01;

public class RemoteControlEx {
    public static void main(String[] args) {
        //interface도 하나의 타입이므로, 변수 타입으로 사용 가능함.
        //interface는 reference 타입이므로 null값을 가질 수 있다.
        RemoteControl rc; //null 들어감.

        //rc 변수에 텔레비전 객체를 대입할 것.
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio(); // Audio로 교체
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

        //상수는 구현 객체와 상관 없는 인터페이스 소속 멤버.
        // 인터페이스로 바로 접근하여 읽기 가능함.
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
