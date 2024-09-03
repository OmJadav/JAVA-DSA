/*Declare a class called book having author_name as private data member. Extend book class 
to have two sub classes called book_publication&paper_publication. Each of these classes 
have private member called title. Write a complete program to show usage of dynamic 
method dispatch (dynamic polymorphism) to display book or paper publications of given 
author. Use command line arguments for inputting data*/
public class Que12 {
    public static void main(String[] args) {
        String authorName = args[0];
        String publicationType = args[1];
        String title = args[2];

    }
}

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void displayPublication() {
        System.out.println("Publication by " + author_name);
    }
}

class Book_publication extends Book {
    private String title;

    Book_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public void displayPublication() {
        System.out.println("Title :" + title + "  by " + getAuthorName());
    }
}

class Paper_publication extends Book {
    private String title;

    Paper_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public void displayPublication() {
        System.out.println("Paper publication titled '" + title + "' by " + getAuthorName());
    }
}