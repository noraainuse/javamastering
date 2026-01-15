package Lab04.q6;

public class Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    public void printDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Year Published: " + this.yearPublished);
        System.out.println("Price: $" + this.price);
        if (isAvailable == true) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }
    }
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    public void markAsUnavailable () {
        this.isAvailable = false;
    }
    public void markAsAvailable () {
        this.isAvailable = true;
    }
    public boolean isPublishedAfter(int year) {
       if (year < yearPublished) {
            return true;
       } else {
            return false;
       }
    }
}
