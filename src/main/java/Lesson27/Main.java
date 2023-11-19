package Lesson27;
public class Main {
    public static void main(String[] args) {
        //Третий принцип
        Figure figure = new Circle();
        printFigureInfo(figure);
        // Четвервый принцип
        Circle circle = new Circle();
        printFigureInfo(circle);
    }
    //Пятый принцип
    public static void printFigureInfo(Figure figure) {
        figure.calculatePerimeter();
        figure.calculateSquare();
        figure.printFigure();
    }
}
