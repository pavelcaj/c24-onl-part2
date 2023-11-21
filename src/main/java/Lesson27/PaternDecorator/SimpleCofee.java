package Lesson27.PaternDecorator;

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Простой кофе";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}