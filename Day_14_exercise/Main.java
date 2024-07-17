package Day_14_exercise;

public class Main {

    public static void main(String[] args) {

        //test Q1
        Movie movie = new Movie("Inception","Nolan",100);
        Book book = new Book("The fire","Abdulaziz",100);
        System.out.println(movie.getDiscount());
        System.out.println(book.getDiscount());
        System.out.println("***********************************");




        //test Q2
        MovablePoint movablePoint = new MovablePoint(0,0,1,1);
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveDown();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveLeft();
        System.out.println("Point after moving : ("+movablePoint.getX()+","+movablePoint.getY()+")");









    }
}
