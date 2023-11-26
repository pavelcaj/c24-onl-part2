package lesson31.hw2;

class Computer {
    private PowerSupply powerSupply;
    private HDD hdd;
    private OpticalDrive opticalDrive;
    private Monitor monitor;

    public Computer() {
        this.powerSupply = new PowerSupply();
        this.hdd = new HDD();
        this.opticalDrive = new OpticalDrive();
        this.monitor = new Monitor();
    }

    public void start() {
        System.out.println("Запуск компьютера");
        powerSupply.start();
        hdd.start();
        opticalDrive.start();
        monitor.start();
        System.out.println("Компьютер запущен");
    }

    public void shutdown() {
        System.out.println("Выключение компьютера");
        powerSupply.shutdown();
        hdd.shutdown();
        opticalDrive.shutdown();
        monitor.shutdown();
        System.out.println("Компьютер выключен");
    }
}