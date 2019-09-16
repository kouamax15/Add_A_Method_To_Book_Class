public class BookApp {
    //public Book(String title, String author, String description, double price, boolean isInStock)
    public static void main ( String[] args) {
        Book novel = new Book("The Mortal Instrument: City of Bones", "Casssandra Clare","Shadowhunters fighting evil", 9.99, true);
        novel.getDisplayText();
    }


}
