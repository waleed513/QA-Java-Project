package assignment1;

public class Book implements Media {
        private String title;
        private double price;
    
        // Getters and Setters
        Book(String title,double price){
            this.title = title;
            this.price = price;

        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        
        public double getPrice(){
            return this.price;
        }

        public void updatePrice(double p){
            this.price = p;
        }
    
        // Method to display book information
        public void displayBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            
            System.out.println();
        }
    }
