/*1 Interface:-Product
   - getName()
   - setName()
2 Book(inherit from product) 
-name
-price
Electronics(inherited from product) 
-name
-price
constructor and methods
Abstract Class shoppingCart
-protected array of products as cart 
-int var count to calculate no.of products in cart 
-constructor ->(parameter ->capasity)(size of cart)
abstract method addProduct(product p) throwing custom exception if cart is full or price 
    is -ve
-calculatePrice() -returns total price and products in cart 
-remove Product() -- remove from cart
4. OnlineShoppingCart(inherited from shopping cart)
-define methods and designed constructor
5 Main class
    create instance of OnlineShoppingCart
    scanner for user input 
    menu inside loop
        1. add books
        2. Add Electronics
        3. View Cart 
        4. Calculates total price
        5. exit*/

import java.util.Scanner;

interface Product {
    String getName();

    void setName(String name);

    double getPrice();
}

class Book implements Product {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics implements Product {
    String name;
    double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

abstract class ShoppingCart {
    protected Product[] cart;
    int count = 0;

    ShoppingCart(int capacity) {
        cart = new Product[capacity];

    }

    abstract void addProduct(Product p);

    double calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < cart.length; i++) {
            totalPrice += cart[i].getPrice();
        }
        return totalPrice;
    }

    void removeProduct(int i) {
        if (i < cart.length) {
            cart[i] = null;
            System.out.println("Product is Removed");
            return;
        }
        System.out.println("Product Does not Exist");
    }
}

class OnlineShoppingCart extends ShoppingCart {
    OnlineShoppingCart(int capacity) {
        super(capacity);
    }

    public void addProduct(Product p) throws CustomException {
        if (p.getPrice() < 0) {
            throw new CustomException("Invalid Price");
        }
        if (count == cart.length) {
            throw new CustomException("Cart is Full");
        }
        cart[count++] = p;
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

class OnlineShoppingCartMain {
    public static void main(String[] args) {
        OnlineShoppingCart obj = new OnlineShoppingCart(10);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. add books\n" +
                    "2. Add Electronics\n" +
                    "3. View Cart \n" +
                    "4. Calculates total price\n" +
                    "5. exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book name:");
                    String bookName = sc.next();
                    System.out.println("Enter Book Price:");
                    double bookPrice = sc.nextDouble();
                    Book b1 = new Book(bookName, bookPrice);
                    try {
                        obj.addProduct(b1);
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter Electronics name:");
                    String electronicsName = sc.next();
                    System.out.println("Enter Electronics Price:");
                    double electronicsPrice = sc.nextDouble();
                    Electronics electronics = new Electronics(electronicsName, electronicsPrice);
                    try {
                        obj.addProduct(electronics);
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    for (int i = 0; i < obj.count; i++) {
                        System.out.println(obj.cart[i].getName());
                        System.out.println(obj.cart[i].getPrice());
                    }
                    break;
                case 4:
                    System.out.println(obj.calculatePrice());
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
        }

    }
}