import java.util.ArrayList;

public class LibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Data Structures", "Mark Allen");

        Member m1 = new Member(101, "Nikhil");

        library.addBook(b1);
        library.addBook(b2);

        library.registerMember(m1);

        System.out.println("\n--- Issue Book ---");
        library.issueBook(101, 1);

        System.out.println("\n--- Borrowed Books ---");
        m1.viewBorrowedBooks();

        System.out.println("\n--- Return Book ---");
        library.returnBook(101, 1);

        System.out.println("\n--- Borrowed Books After Return ---");
        m1.viewBorrowedBooks();

        System.out.println("\n--- Search Book ---");
        library.searchBook("Data Structures");
    }
}

/* ==========================
        PERSON
   ========================== */

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

/* ==========================
        MEMBER
   ========================== */

class Member extends Person {

    private ArrayList<Book> borrowedBooks;

    public Member(int id, String name) {
        super(id, name);
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void viewBorrowedBooks() {

        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }

        System.out.println("Borrowed Books:");

        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Member ID: " + getId());
        System.out.println("Member Name: " + getName());
        System.out.println("Borrowed Books: " + borrowedBooks.size());
    }
}

/* ==========================
        LIBRARIAN
   ========================== */

class Librarian extends Person {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Librarian ID: " + getId());
        System.out.println("Librarian Name: " + getName());
    }
}

/* ==========================
          BOOK
   ========================== */

class Book {

    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void issueBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}

/* ==========================
         LIBRARY
   ========================== */

class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully.");
    }

    public void removeBook(int bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getId() == bookId) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " registered successfully.");
    }

    public Book findBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {
                return book;
            }
        }

        return null;
    }

    public Member findMember(int memberId) {

        for (Member member : members) {

            if (member.getId() == memberId) {
                return member;
            }
        }

        return null;
    }

    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void issueBook(int memberId, int bookId) {

        Member member = findMember(memberId);
        Book book = findBook(bookId);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already issued.");
            return;
        }

        book.issueBook();
        member.borrowBook(book);

        System.out.println("Book issued successfully.");
    }

    public void returnBook(int memberId, int bookId) {

        Member member = findMember(memberId);
        Book book = findBook(bookId);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.returnBook();
        member.returnBook(book);

        System.out.println("Book returned successfully.");
    }
}