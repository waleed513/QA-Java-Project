package assignment1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bookprocessor {
    private ArrayList<Book> books;

    // Constructor to initialize and parse JSON data
    public Bookprocessor(String jsonFilePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(jsonFilePath)) {
            // Parse JSON file to list of Book objects
            books = gson.fromJson(reader, new TypeToken<List<Book>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
            // Handle error (e.g., log error, throw custom exception)
        }
    }
         public ArrayList<Book> getallBooks(){
            return books;
         }
    // Method to display details of all books
    public void displayAllBooks() {
        books.forEach(Book::displayBookInfo);
    }

    // Getters for accessing books list if needed
    public List<Book> getBooks() {
        return books;
    }
}
