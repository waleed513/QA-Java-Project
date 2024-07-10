package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<Media> mediaItems;
    private List<LibraryObserver> observers = new ArrayList<>();

    public Library() {
        String jsonFilePath = "./assignment1/books.json";
        Bookprocessor processor = new Bookprocessor(jsonFilePath);
        this.mediaItems = new ArrayList<>();
        this.mediaItems.addAll(processor.getallBooks());
    }

    public void addMediaItem(Media media) {
        mediaItems.add(media);
        notifyObservers(new LibraryEvent("New media added: " + media.getClass().getSimpleName() + " - " + media.getPrice()));
    }

    public void updateMediaPrice(Media media, double newPrice) {
        media.updatePrice(newPrice);
        notifyObservers(new LibraryEvent("Price updated for " + media.getClass().getSimpleName() + " - " + media.getPrice()));
    }

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.updateEvent(event);
        }
    }

    // Other methods specific to managing library items
}
