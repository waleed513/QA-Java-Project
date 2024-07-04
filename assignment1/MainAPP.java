package assignment1;
public class MainAPP {
    public static void main(String[] args) {
        
        String jsonFilePath = "./assignment1/books.json";

        Bookprocessor processor = new Bookprocessor(jsonFilePath);

        // Display all books //
        processor.displayAllBooks();
    }
}
