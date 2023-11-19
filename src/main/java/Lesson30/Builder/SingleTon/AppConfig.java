package Lesson30.Builder.SingleTon;

public class AppConfig {
    private String appName;
    private int maxConnections;
    private static AppConfig instance;
    private AppConfig() {
        this.appName = "MyApp";
        this.maxConnections = 10;
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }
}