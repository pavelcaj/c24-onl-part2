package lesson31.hw3;

class MiddleDeveloperDecorator implements Developer {
    private final Developer developer;

    public MiddleDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String develop() {
        return developer.develop() + ". Поднимается до уровня среднего разработчика";
    }
}