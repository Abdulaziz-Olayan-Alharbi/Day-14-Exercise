package Day_14_exercise;

public class Movie extends Product{
    private String director;

    public Movie(){

    }

    public Movie(String title, String author, int price) {
        super(title, price);
        this.director = author;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return this.getPrice() * 0.3;
    }

}
