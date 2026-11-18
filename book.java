public class book {
    int bookId;
    String bookName;
    String author;

    book(int id, String name, String author) {
        this.bookId = id;
        this.bookName = name;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        book b = new book(101, "Java Programming", "James Gosling");
        b.displayBook();
    }
}