package Lesson27.PaternDecorator;
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", сахар";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}