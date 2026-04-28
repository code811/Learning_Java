package Lesson53_aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void displayInfo() { // The Library class utilizes the Book class
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: " );
        for(Book book : books) {
            System.out.println(book.displayInfo());;
        }
    }
}
