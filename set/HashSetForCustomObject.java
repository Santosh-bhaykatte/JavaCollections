package javaCollections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Critical: Overriding equals() and hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return title.equals(book.title) && author.equals(book.author);
    }

     */
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return "Book{"+ "title='"+ title +'\''+ ", author='"+ author + '\'' +'}';
    }
}

public class HashSetForCustomObject {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Aldous Huxley", "Aldous Huxley");

        books.add(b1);      // return map.put(b1, PRESENT) == null;
        books.add(b2);

        // This duplicate will NOT be added because equals() and hashCode() are correctly implemented
        boolean isAdded = books.add(new Book("1984", "George Orwell"));

        System.out.println("Was the duplicate book added? " + isAdded); // false
        System.out.println("Set of books: " + books.size()); // 2
        System.out.println(books);
    }
}
