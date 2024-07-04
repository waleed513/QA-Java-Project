package assignment1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Bookprocessor {
    private List<Book> books;

    
    public Bookprocessor(String jsonFilePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(jsonFilePath)) {
            // Parse JSON file to list of Book objects
            books = gson.fromJson(reader, new TypeToken<List<Book>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    
    public void displayAllBooks() {
        books.forEach(Book::displayBookInfo);
    }

    
    public List<Book> getBooks() {
        return books;
    }
}
