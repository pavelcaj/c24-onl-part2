package lesson31.hw2;
class Monitor implements ComputerComponent {
    @Override
    public void start() {
        System.out.println("Включение монитора");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение монитора");
    }
}