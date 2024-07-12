package _05_class._interface._02;

interface move{
    void moveForward();
    void moveBackward();
}

interface power{
    void powerOn();
    void powerOff();
}

//인터페이스의 "다중 상속"
//- extends : 인터페이스가 인터페이스를 상속받을 때.
//- implements : 클래스가 인터페이스를 구현할 때.
interface Car extends move, power{
    void changeGear(int gear);
}

class Suv implements Car{

    @Override
    public void moveForward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동켬");
    }

    @Override
    public void powerOff() {
        System.out.println("시동끔");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("기어 변경 : "+ gear);
    }
}

public class InterfaceEx02 {
    public static void main(String[] args) {
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(5);
        mySuv.moveForward();
        mySuv.powerOff();
    }
}
