package Day_14_exercise;

public class Book extends Product{
    private String author;


    public Book(){

    }
    public Book(String title, String author, int price) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return this.getPrice()*0.5;
    }
}
