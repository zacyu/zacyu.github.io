public class Book {
    private String title;
    private String author;
    private String isbn;
    private String subject;
    private boolean fiction;
    private int editionNumber;

    public Book(String title, String author, String isbn, String subject,
        boolean fiction, int editionNumber) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.subject = subject;
        this.fiction = fiction;
        this.editionNumber = editionNumber;
    }

    public Book(String isbn) {
        this(null, null, isbn, null, false, 0);
    }

    public Book(Book another) {
        this(another.title, another.author, another.isbn, another.subject,
            another.fiction, another.editionNumber);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getSubject() {
        return this.subject;
    }

    public boolean getFiction() {
        return this.fiction;
    }

    public int getEditionNumber() {
        return this.editionNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public String toString() {
        return "Title: " + this.title + "\n" +
            "Author: " + this.author + "\n" +
            "ISBN: " + this.isbn + "\n" +
            "Subject: " + this.subject + "\n" +
            "Fiction?: " + (this.fiction ? "Yes" : "No") + "\n" +
            "Edition: " + this.editionNumber + "\n";
    }

    public boolean equals(Book another) {
        return this.title.equals(another.title) &&
            this.author.equals(another.author) &&
            this.isbn.equals(another.isbn) &&
            this.subject.equals(another.subject) &&
            this.fiction == another.fiction &&
            this.editionNumber == another.editionNumber;
    }

    public boolean equals(String isbn) {
        return this.isbn.equals(isbn);
    }
}
