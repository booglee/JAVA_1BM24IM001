package P;
import java.util.*;

class Book {
    String name, author;
    double price;
    int num_pages;

    Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setDetails(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    String getDetails() {
        return name + " " + author + " " + price + " " + num_pages;
    }

    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of book " + (i + 1));
            String name = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            int pages = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(name, author, price, pages);
        }
        for (Book b : books) {
            System.out.println(b);
        }
        sc.close();
    }
}