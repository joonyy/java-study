package _05_class.inheritance;

public class Dog extends Animal{

    //메서드 오버라이딩. 부모 클래스의 makeSound() 메서드 재정의
    @Override // 컴파일러가 정확히 오버라이딩 되었는지 체크하는 기능.(생략해도 상관없음)
    void makeSound() {
        super.makeSound();
        System.out.println("멍멍!");
    }
    void fetch(){
        System.out.println("공 가져와!");
    }
}
//부모 메서드 호출
// - 메서드 오버라이딩 : 부모 메서드는 옮겨지고 자식 메서드만 사용.
// - (오버라이딩 하려는 자식 메서드가 부모 메서드의 일부만 변경되더라도 중복된 내용을 자식 메서드도 가지고 있어야 함.)
// - ex) 부모 메서드가 100줄의 코드를 가지고 있으면, 자식 메서드에서 나머지 내용이 동일하고 1줄만 추가하고 싶어도 100줄을 다 작성해야 함.
// - 자식 메서드에서 부모 메서드를 호출.
// - ex) super.메서드이름() => 숨겨진 부모 메서드 호출.
