package Practice.Pr4;

import java.util.ArrayList;
import java.util.List;

interface Borrowable {
    void borrow();
    void returnItem();
}

//Borrowable 인터페이스
class Book implements Borrowable{
    private String title;
    private String author;
    private String publisher;
    private int year;
    private boolean isBorrowed;

    public Book(String title, String author, String publisher, int year){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isBorrowed = false;
    }
    @Override
    public void borrow() {
        if(isBorrowed){
            System.out.println(this.title + " 책이 현재 대출중입니다.");
        }else{
            isBorrowed = true;
            System.out.println(this.title + " 책을 빌립니다!");
        }
    }

    @Override
    public void returnItem() {
        if(isBorrowed){
            isBorrowed = false;
            System.out.println(this.title + " 책을 반납합니다!");
        }else{
            System.out.println(this.title + " 책은 대출되지 않았습니다.");
        }
    }

    public String getTitle() {
        return title;
    }

    //빌린 책이다.(책 기준)
    public boolean isBorrowed() {
        return isBorrowed;
    }
}
class LibraryUser{
    private String name;
    private String phoneNumber;
    private List<Book> myBooks;

    public LibraryUser(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber= phoneNumber;
        this.myBooks = new ArrayList<>(); //유저가 빌린 책.
    }

    //유저입장에서 책 대출
    public void borrowBook(Book book){
        if(myBooks.size() < 3 && !book.isBorrowed()){
            book.borrow();
            myBooks.add(book);
        }else if(myBooks.size()>=3) System.out.println("더 이상 책을 빌릴 수 없습니다. 최대 3권까지 대출 가능합니다.");
        else {
            System.out.println("이 책은 이미 대출 중입니다.");
        }
    }
    //유저입장에서 책 반납
    public void returnBook(Book book){
        if(myBooks.contains(book)){
            book.returnItem();
            myBooks.remove(book);
            System.out.println("반납이 완료되었습니다.");
        }else {
            System.out.println("빌리지 않은 책입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


public class Library{
    private List<Book> books = new ArrayList<>();
    //도서관에 책 추가
    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " 책을 도서관에 추가하였습니다!");
    }
    //도서관에 책 반납
    public void deleteBook(Book book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println("책을 도서관에서 삭제하였습니다!");
        }else{
            System.out.println(book.getTitle() + " 책을 찾을 수 없습니다.");
        }
    }
    public void borrowBook(Book book, LibraryUser user){
        user.borrowBook(book);
    }
    public void returnBook(Book book, LibraryUser user){
        user.returnBook(book);
    }

    public void showAllBooks(){
        System.out.println("도서관 책 목록");
        for(Book book : books){
            if(book.isBorrowed()){
                System.out.println(book.getTitle() + ", 대출중");
            }else {
                System.out.println(book.getTitle() + ", 대출 가능");
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
