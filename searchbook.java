public class searchbook {
    public static void main(String[] args) {
        String[] books = {
            "Java Programming",
            "Python Basics",
            "Data Structures"
        };

        String search = "Python Basics";
        boolean found = false;

        for (String book : books) {
            if (book.equalsIgnoreCase(search)) {
                System.out.println("Book Found: " + book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }
}