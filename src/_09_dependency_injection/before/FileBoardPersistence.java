package _09_dependency_injection.before;

public class FileBoardPersistence {
    public void save(){
        System.out.println("파일에 게시판 저장 중...");
    }

    public void delete(){
        System.out.println("파일 게시판 삭제 중...");
    }
}
