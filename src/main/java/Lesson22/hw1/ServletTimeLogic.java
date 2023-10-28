package Lesson22.hw1;

public class ServletTimeLogic {
    public static String logic(String path) {
        String timeZone;
        if ("/minsk".equals(path)) {
            timeZone = "Europe/Minsk";
        } else if ("/washington".equals(path)) {
            timeZone = "America/New_York";
        } else if ("/beijing".equals(path)) {
            timeZone = "Asia/Shanghai";
        } else {
            timeZone = "UTC";
        }
        return timeZone;
    }
}
