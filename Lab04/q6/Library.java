package Lab04.q6;

public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot) {
        if (slot == 1) {
            this.book1 = book;
        }
        if (slot == 2) {
            this.book2 = book;
        }
        if (slot == 3) {
            this.book3 = book;
        }
    }
    public void removeBook(int slot) {
        if (slot == 1) {
            this.book1 = null;
        }
        if (slot == 2) {
            this.book2 = null;
        }
        if (slot == 3) {
            this.book3 = null;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + this.libraryName);
        // book1
        System.out.println();
        if (book1 != null) {
            System.out.println("Title: " + book1.title);
            System.out.println("Author: " + book1.author);
            System.out.println("Publisher: " + book1.publisher);
            System.out.println("Year Published: " + book1.yearPublished);
            System.out.println("Price: $" + book1.price);
            if (book1.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
        }
        } else {
            System.out.println("No book in this slot.");
            System.out.println();
        }

        System.out.println();
        // book2
        if (book2 != null) {
            System.out.println("Title: " + book2.title);
            System.out.println("Author: " + book2.author);
            System.out.println("Publisher: " + book2.publisher);
            System.out.println("Year Published: " + book2.yearPublished);
            System.out.println("Price: $" + book2.price);
            if (book2.isAvailable == true) {
                System.out.println("Available: Yes");
        } else {
                System.out.println("Available: No");
            } 
        } else {
            System.out.println("No book in this slot.");
        }
        
        //book3
        System.out.println();
        if (book3 != null) {
            System.out.println("Title: " + book3.title);
            System.out.println("Author: " + book3.author);
            System.out.println("Publisher: " + book3.publisher);
            System.out.println("Year Published: " + book3.yearPublished);
            System.out.println("Price: $" + book3.price);
            if (book3.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            } 
        } else {
            System.out.println("No book in this slot.");
        }

    }
    public void checkBookAvailability(int slot) {
        Book book = null;
        if (slot == 1) {
            book = this.book1;
        } 
        else if (slot == 2) {
            book = this.book2;
        }
        else if (slot == 3) {
            book = this.book3;
        }

        if (book != null) {
            System.out.println(book.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + "is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        Book Nowbookslot = null;
        if (slot == 1) {
            Nowbookslot = this.book1;
        } 
        else if (slot == 2) {
            Nowbookslot = this.book2;
        }
        else if (slot == 3) {
            Nowbookslot = this.book3;
        }
        
        if (Nowbookslot != null) {
            Nowbookslot.price = newPrice;
            System.out.println("Updated price of " + Nowbookslot.title + " to $" + newPrice + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book) {
        if (book != null) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            if (book.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        } else {
            System.out.println("No book in this slot.");
        }
    }
    
}
