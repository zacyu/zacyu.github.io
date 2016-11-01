public class BookDriver {
    public static void printBookInfo(Book book) {
        if (book.getFiction()) {
            System.out.println(book.getTitle() + ", Edition: " +
                book.getEditionNumber());
        } else {
            System.out.println(book.getTitle() + ", Subject: " +
                book.getSubject());
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Computing Systems",
            "Yale Patt", "9780087463", "Computer Science", false, 2);
        
        Book book2 = new Book("9002322134");
        
        System.out.println("Book 1\n---\n" + book1 + "\n" +
            "Book 2\n---\n" + book2);
        
        book2.setTitle("Crime and Punishment");
        book2.setAuthor("Fyodor Dostoevsky");
        book2.setIsbn("9002322134");
        book2.setSubject("Literature");
        book2.setFiction(true);
        book2.setEditionNumber(1);

        System.out.println("Book 2 (Updated)\n---\n" + book2);

        Book book3 = new Book("Essential Matlab for Engineers and Scientists",
            "Brian Hahn", "9883740001", "Engineering", false, 3);

        Book book4 = new Book(book3);

        System.out.println("book3 == book4: " + book3.equals(book4));
        System.out.println("book2 == 9002322134: " + book2.equals("9002322134"));

        printBookInfo(book1);
        printBookInfo(book2);
        printBookInfo(book3);
        printBookInfo(book4);
    }
}
