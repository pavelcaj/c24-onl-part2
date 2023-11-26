package lesson31.hw3;

class TeamLeadDeveloperDecorator implements Developer {
    private final Developer developer;

    public TeamLeadDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String develop() {
        return developer.develop() + ". Становится лидером команды";
    }
}