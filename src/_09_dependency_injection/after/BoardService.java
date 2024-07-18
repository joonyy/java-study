package _09_dependency_injection.after;

// 게시판 목록을 관리하는 기능 제공
public class BoardService {

    // case1. 생성자를 이용한 의존성 주입
    private final IBoardPersistence persistence; // interface
    public BoardService(IBoardPersistence p) {
        this.persistence = p;
    }

    // case2. setter 를 이용한 의존성 주입
    //private IBoardPersistence persistence;
    //    // interface, setter 를 사용하기 위해 final 키워드 제거
    //public void setPersistence(IBoardPersistence p) {
    //    this.persistence = p;
    //}

    public void save() {
        persistence.save();
    }

    public void delete() {
        persistence.delete();
    }

}