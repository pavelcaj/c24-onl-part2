package lesson31.hw2;

class PowerSupply implements ComputerComponent {
    @Override
    public void start() {
        System.out.println("Включение питания");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение питания");
    }
}