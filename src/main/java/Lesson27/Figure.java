package Lesson27;
/**
 * Самостоятельно придумать минимум по 1 примеру на каждый из принципов SOLID
 */
//Первый принцип клас делает только то что должен(1 задача на класс)
public class Figure implements FigureOperations {
    private double perimetr;
    private double square;
    protected void printFigure() {
        System.out.println("Some figure");
    }
    @Override
    public void calculatePerimeter() {
    }
    @Override
    public void calculateSquare() {
    }
}
