package assignment1;

public class Movie implements Media {
    private String title;
        private double price;
        private Metadata metadata;
    
        // Getters and Setters
        Movie(String title,double price){
            this.title = title;
            this.price = price;

        }
        
        public double getPrice(){
            return this.price;
        }

        public void updatePrice(double p){
            this.price = p;
        }
    
        // Method to display book information
        public void displayMovieInfo() {
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);

            System.out.println();
        }
}
