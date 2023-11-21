package Lesson27.PaternDecorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Описание: " + simpleCoffee.getDescription());
        System.out.println("Цена: " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Описание: " + milkCoffee.getDescription());
        System.out.println("Цена: " + milkCoffee.cost());

        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Описание: " + sugarCoffee.getDescription());
        System.out.println("Цена: " + sugarCoffee.cost());

        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Описание: " + milkAndSugarCoffee.getDescription());
        System.out.println("Цена: " + milkAndSugarCoffee.cost());
    }
}