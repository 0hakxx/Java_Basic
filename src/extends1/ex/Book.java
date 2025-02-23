package extends1.ex;

import java.security.PrivateKey;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
