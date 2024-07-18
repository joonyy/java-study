package _09_dependency_injection.after;

// "파일"에 게시판 목록을 저장하는 클래스
public class FileBoardPersistence implements IBoardPersistence {
    public void save() {
        System.out.println("Save file board..");
    }

    public void delete() {
        System.out.println("Delete file board..");
    }
}