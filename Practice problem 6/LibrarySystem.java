import java.util.*;

class Book {
    int id;
    String nm;
    String auth;
    String yr;
    float pr;
    String st;

    Book(int id, String nm, String auth, String yr, float pr, String st) {
        this.id = id;
        this.nm = nm;
        this.auth = auth;
        this.yr = yr;
        this.pr = pr;
        this.st = st;
    }

    void add() {
        System.out.println("New book " + nm + " is added");
    }

    void del() {
        System.out.println(nm + " is deleted");
    }

    void show() {
        System.out.println("Book name: " + nm + " with id: " + id + ", written by: " + auth);
        System.out.println("Publication year: " + yr + ", Price: " + pr + " taka");
    }

    void info() {
        System.out.println("Inquiring about: " + nm + " with id: " + id);
    }
}

class Librarian {
    int id;
    String nm;

    Librarian(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }

    void search(String bk) {
        System.out.println("Searching book: " + bk);
    }

    boolean verify(int uid) {
        System.out.println("Verifying membership for User ID: " + uid);
        return true;
    }

    void order() {
        System.out.println("Ordering Book: " + nm);
    }

    void sell() {
        System.out.println("Selling Book: " + nm);
    }
}

class Publisher {
    int id;
    String nm;
    String addr;
    int ph;

    Publisher(int id, String nm, String addr, int ph) {
        this.id = id;
        this.nm = nm;
        this.addr = addr;
        this.ph = ph;
    }

    void add() {
        System.out.println("Adding new publisher: " + nm);
    }

    void mod() {
        System.out.println("Modifying publisher details of " + nm);
    }

    void del() {
        System.out.println("Deleting info of publisher: " + nm);
    }

    void status() {
        System.out.println("Checking order status of " + nm + "'s book.");
    }
}

class User {
    int id;
    String nm;
    String addr;
    int ph;

    User(int id, String nm, String addr, int ph) {
        this.id = id;
        this.nm = nm;
        this.addr = addr;
        this.ph = ph;
    }

    void ret() {
        System.out.println("Returning book by user: " + nm + " with id: " + id);
    }

    int fine(int day) {
        int f = day * 5;
        System.out.println("Paying fine for " + day + " days delay.");
        System.out.println("Fine is " + f + " taka");
        return f;
    }

    void add() {
        System.out.println("Adding new user: " + nm + " with id: " + id);
    }

    void del() {
        System.out.println("Deleting user: " + nm);
    }

    void upd() {
        System.out.println("Updating details of user: " + nm);
    }

    void buy() {
        System.out.println(nm + " is buying a book.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book(1, "Java Programming", "Author X", "2020", 499.99f, "Available");
        b.show();

        Librarian l = new Librarian(281371, "Maha");
        l.search("Java Programming");

        Publisher p = new Publisher(30231, "XYZ Publishers", "456 Avenue", 987654321);
        p.status();

        User u = new User(34201, "Sami", "123 Street", 123456789);
        u.buy();
        u.fine(7);
    }
}
