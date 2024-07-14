package Practice.Pr4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<LibraryUser> Users = new ArrayList<>();
    static LibraryUser currentUser = null;
    static boolean isLoggedIn = false;
    static boolean isAdmin = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        initializeLibrary(library);
        while(true){
            if(!isLoggedIn) {
                System.out.println("도서관에 오신 것을 환영합니다!");
                System.out.println("처음 오시는건가요?");
                System.out.println("1. 예 / 2. 아니오 / 3. 제가 관리자입니다.");
                int num = sc.nextInt();
                if(num == 1) {
                    System.out.println("회원가입을 위해 이름과 전화번호를 입력해주세요!");
                    System.out.print("이름 : ");
                    String name = sc.next();
                    System.out.print("전화번호 : ");
                    String phone = sc.next();
                    register(name, phone);
                } else if (num == 2) {
                    System.out.print("이름과 전화번호를 알려주세요!");
                    System.out.print("이름 :");
                    String name = sc.next();
                    System.out.print("전화번호 : ");
                    String phone = sc.next();
                    if(login(name, phone)) {
                        System.out.println("입장하시죠.");
                        isLoggedIn = true;
                    }else{
                        System.out.println("잘못된 입력입니다.");
                        System.exit(0);
                }
                }else if(num == 3){
                    System.out.println("못알아 봬어 죄송합니다!");
                    isLoggedIn= true;
                    isAdmin = true;
                }
                else{
                    System.out.println("안녕히.");
                    System.exit(0);
                }
            }
            System.out.println("무엇을 하시겠습니까?");
            if(isAdmin) {
                System.out.println("1. 유저 누구있나 훔쳐보기 / 2. 책 추가하기 / 3. 책 삭제하기 / 4. 책 목록보기 / 5. 로그아웃 / 6. 종료");
                int cmd = sc.nextInt();
                switch (cmd){
                    //유저 정보 출력
                    case 1:
                        showUsers();
                        break;
                    //도서관에 책 추가하기
                    case 2:
                        System.out.println("추가할 책의 제목, 저자, 출판사, 출판연도를 입력해주세요!");
                        System.out.print("제목: ");
                        String title = sc.next();
                        System.out.print("저자: ");
                        String author = sc.next();
                        System.out.print("출판사: ");
                        String publisher = sc.next();
                        System.out.print("출판연도: ");
                        int year = sc.nextInt();
                        library.addBook(new Book(title, author, publisher, year));
                        break;
                    //도서관에 책 삭제하기
                    case 3:
                        System.out.print("삭제할 책의 정보를 입력해주세요! : ");
                        String deleteBookTitle = sc.next();
                        Book bookToDelete = findBookByTitle(library,deleteBookTitle);
                        library.deleteBook(bookToDelete);
                        break;
                    case 4:
                        library.showAllBooks();
                        break;
                    case 5:
                        System.out.println("다음에 만나요~");
                        isLoggedIn = false;
                        isAdmin = false;
                        break;
                    case 6:
                        System.out.println("다음에 만나요~");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못된 명령어입니다.");
                        break;
                }
            }else {
                System.out.println("1. 책 대출하기 / 2. 책 반납하기 / 3. 책 목록보기 / 4. 로그아웃 / 5. 종료");
                int cmd = sc.nextInt();
                switch (cmd){
                    //책 대출하기
                    case 1:
                        System.out.print("대출할 책의 제목을 입력해주세요: ");
                        String borrowTitle = sc.next();
                        Book bookToBorrow = findBookByTitle(library, borrowTitle);
                        if(bookToBorrow != null){
                            library.borrowBook(bookToBorrow, currentUser);
                        }else{
                            System.out.println("잘못된 입력입니다.");
                        }
                        break;
                    //책 반납하기
                    case 2:
                        System.out.println("반납할 책의 제목을 입력해주세요!");
                        System.out.print("제목: ");
                        sc.nextLine();
                        String title = sc.nextLine();
                        Book bookToReturn = findBookByTitle(library,title);
                        if(bookToReturn != null){
                            library.returnBook(bookToReturn,currentUser);
                        }else{
                            System.out.println("잘못된 입력입니다.");
                        }
                        break;
                    //책 목록 보기
                    case 3:
                        library.showAllBooks();
                        break;
                    case 4:
                        System.out.println("다음에 만나요~");
                        isLoggedIn = false;
                        isAdmin = false;
                        break;
                    case 5:
                        System.out.println("다음에 만나요~");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못된 명령어입니다.");
                        break;
                }
            }

        }
    }


    static void register(String name, String phoneNumber){
        currentUser = new LibraryUser(name, phoneNumber);
        Users.add(currentUser);
        isLoggedIn = true;
        System.out.println("회원가입이 완료되었습니다.");
    }
    static boolean login(String name, String phoneNumber) {
        for (LibraryUser user : Users) {
            if (user.getName().equals(name) && user.getPhoneNumber().equals(phoneNumber)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }
    static void showUsers() {
        for (LibraryUser user : Users) {
            System.out.println("Name: " + user.getName() + ", Phone: " + user.getPhoneNumber());
        }
    }
    static Book findBookByTitle(Library library, String title) {
        for (Book book : library.getBooks()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    static void initializeLibrary(Library library) {
        library.addBook(new Book("싯다르타", "헤르만 헤세", "민음사", 1922));
        library.addBook(new Book("자바 프로그래밍", "우재남", "한빛미디어", 2018));
        library.addBook(new Book("나를 소모하지 않는 현명한 태도에 관하여", "마티아스 뇔케", "퍼스트펭귄", 2016));
    }
}
