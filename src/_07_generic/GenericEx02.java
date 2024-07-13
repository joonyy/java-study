package _07_generic;

//Number 클래스란? => 모든 숫자형식에 대한 부모 클래스
// - Java에서 모든 숫자형식의 부모 클래스
// - 정수, 실수형 데이터 타입을 모두 포함한다.
//ex) Byte,Short, Long, Integer, Float, Double

import _05_class._access_modifier._pack1.B;

//Generic 제한 case 1.
// - Box 클래스는 제네릭 타입 T를 받지만, 제한을 두어 Number를 상속한 클래스만 허용.
class Box<T extends  Number>{
    private T item;

    public void setItem(T item) {this.item = item;}
    public T getItem(){return item;}
}

//Generic 제한 case2.

interface Movable{
    void move();
}

class Car implements Movable {
    @Override
    public void move() {System.out.println("자동차 출발~");}
}
class Bicycle implements Movable {
    @Override
    public void move() {System.out.println("자전거 출발~");}
}

// - Container 클래스는 제네릭 타입 T를 받지만, 제한을 두어 Movable 인터페이스를 구현한 클래스만 허용함.
// - makeItMove메서드는 해당 객체의 move메서드 호출.
class Container<T extends Movable>{
    private T item;
    public Container(T item){ this.item = item;}//생성자.
    public void makeItMove(){item.move();}
}

public class GenericEx02 {
    public static void main(String[] args) {
//        Box<String> sBox = new Box<>(); // Number를 상속받은 wrapper만 들어가므로 컴파일 에러 발생.

        Box<Double> dBox = new Box<>();
        dBox.setItem(3.14);
        System.out.println(dBox.getItem());

        Box<Integer> iBox = new Box<>();
        iBox.setItem(10000);
        System.out.println(iBox.getItem());

        Box<Short> sBox = new Box<>();
        //sBox.setItem(42);//기본적으로 Java에서 정수 리터럴은 int로 간주함.
        sBox.setItem((short)42); // 명시적 형변환으로 short임을 나타내줘야 한다.
        System.out.println(sBox.getItem());

        /////////////////////////////////////////
        Container<Car> cc = new Container<>(new Car());
        Container<Bicycle> bc = new Container<>(new Bicycle());
        cc.makeItMove();
        bc.makeItMove();

    }
}
