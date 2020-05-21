package library;

import java.io.*;

public class Library implements Serializable {


    private Book books[] = new Book[0];

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


}








