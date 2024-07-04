package assignment1;
public class MainAPP {
    public static void main(String[] args) {
        // Replace with the actual path to your books.json file//
        String jsonFilePath = "./assignment1/books.json";

        Bookprocessor processor = new Bookprocessor(jsonFilePath);

        // Display all books
        processor.displayAllBooks();
    }
}
