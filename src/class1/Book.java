package class1;

public class Book {
    String title;
    String author;
    int pages;
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + pages);
    }

    Book(){} //기본 생성자

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
