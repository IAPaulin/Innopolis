package library;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String author;
    private short yearPublications;
    private float price;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublications() {
        return yearPublications;
    }

    public void setYearPublications(short yearPublications) {
        this.yearPublications = yearPublications;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
