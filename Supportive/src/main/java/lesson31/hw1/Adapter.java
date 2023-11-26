package lesson31.hw1;
class Adapter implements Target {
    private Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return "Адаптер: " + adaptee.specificRequest();
    }
}
