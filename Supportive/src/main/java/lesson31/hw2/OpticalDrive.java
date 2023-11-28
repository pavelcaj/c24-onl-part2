package lesson31.hw2;
class OpticalDrive implements ComputerComponent {
    @Override
    public void start() {
        System.out.println("Запуск дисковода");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение дисковода");
    }
}