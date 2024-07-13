package _08_collection._set;

public class Course {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // 참고. hashCode 란?
    // - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
    // - hashCode() 메소드: Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환 기능
    // => 이 클래스에서 hashCode() 재정의: 객체 내부 상태를 기반으로 한 고유한 해시코드 생성할 것 (내가 원하는 해시 코드로 커스터마이징)
    @Override
    public int hashCode() {
        // title 필드의 타입은 String 이므로 hashCode() 메소드 사용
        // id 는 int 타입이므로 정수 값의 해시코드에 더하기 연산

        // => course 인스턴의 title, id 가 같다면 동일한 해시코드를 반환하도록
        return title.hashCode() + id;
    } // => id, title 이 같으면 동일한 hashCode 를 리턴

    @Override
    public boolean equals(Object obj) {
        // instanceof 문
        // - 객체의 타입을 확인하는데 사용하는 키워드

        // obj instanceof Course target
        // - obj 를 Course 타입으로 캐스팅해서 target 변수에 할당

        if (obj instanceof Course target) {
            // id 는 int 이므로 == 비교 가능
            // title 은 String 이므로 equals() 비교
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    } // => id, title 이 같으면 true 리턴

    @Override
    public String toString() {
        return "Course {" + id + " " + title + "}";
    }
}