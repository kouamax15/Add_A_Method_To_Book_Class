//overload (applies to methods)
//A method in a class is overloaded if there is more than one method by the same name.
// If the same name is used, the methods must different in the number and/or types of the parameters so that there is no confusion.
// This really has nothing to do with classes, only methods.
public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {
    }

    public Book(String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    //making a new method getDisplayText()
//    public void getDisplayText() {
//        System.out.println ("Book title: " + getTitle());
//        System.out.println("Book author: " + getAuthor());
//        System.out.println("Book description: " + getDescription());
    public String getDisplayText() {
        String result = "";
        result = getTitle() + getAuthor() + getDescription();
        return result;
    }

    public double displayBookCost(int number){
        double total = 0;
        if (isInStock()) {
            total = getPrice() * number;
        } return total;
   }

}


//    int sum = add(x, y);
//        System.out.println(sum);public int(getsum){
//        int sum = num1 + num2;
//        return sum;