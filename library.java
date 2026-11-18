
import java.util.Scanner;

public class library {

    static Scanner sc = new Scanner(System.in);

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("\nBook Added Successfully!");
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }

    static void searchBook() {
        // Search functionality will be added in another branch.
    }

    public static void main(String[] args) {
        addBook();
    }
}
