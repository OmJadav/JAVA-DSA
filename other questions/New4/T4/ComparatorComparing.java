import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ComparatorComparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> myStore = new ArrayList<Book>();
        Book b1 = new Book(1, "Java");
        System.out.println(b1);
        myStore.add(new Book(2, "AI"));
        myStore.add(new Book(3, "ML"));

        System.out.println("List of Books in My Store");
        Iterator i = myStore.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
       
       
        do  {
            System.out.println("1. Add Books\n2. Print Books\n3. Sort Books using Title\n4. Sort Books using id\n5. exit");
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Book Title : ");
                    String bl=sc.next();
                    System.out.println("Add Book Id : ");
                    int id=sc.nextInt();
                    myStore.add(new Book( id,bl));
                    break;
                case 2:
                    System.out.println("ALL BOOKS");
                    i = myStore.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    break;
                case 3:
                    System.out.println("Enter Title to sort:");
                    String title = sc.next();
                    Collections.sort(myStore,Comparator.comparing(Book::getTitle));  
                    for(Book b:myStore){
                        System.out.println(b);
                    }                  
                    break;
                case 4:
                    System.out.println("Enter Id to sort:");
                    int idToSort = sc.nextInt();
                    Collections.sort(myStore,Comparator.comparingInt(Book::getId)); 
                    for(Book b:myStore){
                        System.out.println(b);
                    }
                    break;
                case 5:
                System.exit(0);
                default:
                System.out.println("Invalid Choice");
                    break;
            }
        }while(true);
    }
}

class Book {
    int id;
    String title;

    Book(int id, String title) {
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