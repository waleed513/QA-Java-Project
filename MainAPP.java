package assignment1;

import java.util.List;

public class MainAPP {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        System.out.println();
        

        // List<Book> mybookList=;
        LibraryObserver emailNotifier = new EmailNotificationObserver();
        library.addObserver(emailNotifier);
        
        System.out.println();
        // Book book1 = new Book("abc",10);
        //library.addMediaItem(mybookList.get(0));
        
        // library.updateMediaPrice(mybookList.get(0), 34.99);
        
        Movie movie1 = new Movie("Dhoom3",100);
        library.addMediaItem(movie1);

        library.updateMediaPrice(movie1,120.5);
    }
}

class EmailNotificationObserver implements LibraryObserver {
    @Override
    public void updateEvent(LibraryEvent event) {
        System.out.println("Received event: " + event.getEventDescription());
        // Implement email notification logic here
    }
}
