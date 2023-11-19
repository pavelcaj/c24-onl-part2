package Lesson30.Builder.SingleTon;
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Max Connections: " + config.getMaxConnections());
        config.setAppName("NewApp");
        config.setMaxConnections(20);
        System.out.println("Updated App Name: " + config.getAppName());
        System.out.println("Updated Max Connections: " + config.getMaxConnections());
    }
}