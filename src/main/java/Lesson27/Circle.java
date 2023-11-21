package Lesson27;
// Второй принцип код расширяется, а не модифициурется
public class Circle extends Figure{
    @Override
     protected void printFigure(){
        System.out.println("Circle");
    }
    @Override
    public void calculatePerimeter() {
    }
    @Override
    public void calculateSquare() {
    }
}
