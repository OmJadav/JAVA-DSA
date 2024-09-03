//wap to create a class Book with title and price
// create two sets available & sold 
// create 5 book objects
// add 4 of them in available set 
// add 1 book in sold set
// remove one book from available set and insert into sold set

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Book1 b1 = new Book1(101, "JAVA");
        Book1 b2 = new Book1(102, "PYTHON");
        Book1 b3 = new Book1(103, "C++");
        Book1 b4 = new Book1(104, "JAVASCRIPT");
        Book1 b5 = new Book1(104, "RUBY");
        HashSet<Book1> available = new HashSet<>();
        HashSet<Book1> sold = new HashSet<>();

        available.add(b1);
        available.add(b2);
        available.add(b3);
        available.add(b4);
        System.out.println("Available BOok : "+available);
        sold.add(b5);
        System.out.println("sold BOok : "+sold);

    }

}

class Book1 {
    int id;
    String title;

    Book1(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Book id : " + id + " Book title : " + title;

    }
}