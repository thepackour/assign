// 스터디 때 썼던 코드

public class Book {
    String title;
    String author;
    int page;

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title) {
        this(title, "Someone");
    }

    Book() {
        this("Something");
    }
}
