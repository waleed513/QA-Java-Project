package assignment1;

public class Book {
        private String title;
        private String author;
        private Metadata metadata;
    
        // Getters and Setters
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public Metadata getMetadata() {
            return metadata;
        }
        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }
    
        // Method to display book information
        public void displayBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Metadata:");
            System.out.println("\tPrice: $" + metadata.getPrice());
            System.out.println("\tCategories: " + metadata.getCategories());
            System.out.println("\tISBN: " + metadata.getIsbn());
            System.out.println("\tPages: " + metadata.getPages());
            System.out.println();
        }
    }
