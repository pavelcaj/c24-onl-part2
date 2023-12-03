package lesson33;

class Engine implements Cloneable {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}