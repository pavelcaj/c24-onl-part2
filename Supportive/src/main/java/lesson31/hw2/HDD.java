package lesson31.hw2;
    class HDD implements ComputerComponent {
        @Override
        public void start() {
            System.out.println("Запуск жесткого диска");
        }

        @Override
        public void shutdown() {
            System.out.println("Выключение жесткого диска");
        }
    }