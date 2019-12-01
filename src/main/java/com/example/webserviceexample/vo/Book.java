package com.example.webserviceexample.vo;

import com.example.webserviceexample.validator.ValidBook;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@ValidBook(message = "Invalid Book")
public class Book {

    @NotEmpty(message = "Book name can not be empty!")
    private String name;

    @NotEmpty(message = "Book author can not be empty!")
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
