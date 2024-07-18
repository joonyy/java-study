package _09_dependency_injection.before;

public class BoardService {
    private final FileBoardPersistence persistence;

    public BoardService(){
        this.persistence = new FileBoardPersistence();
    }

    public void save(){
        persistence.save();
    }

    public void delete(){
        persistence.delete();
    }
}
