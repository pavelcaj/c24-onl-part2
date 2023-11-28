package lesson31.hw3;

class SeniorDeveloperDecorator implements Developer {
    private final Developer developer;

    public SeniorDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String develop() {
        return developer.develop() + ". Повышается до уровня опытного разработчика";
    }
}