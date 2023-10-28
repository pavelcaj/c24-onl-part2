package Lesson22.hw1;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Задача 1:
 * Создать приложение, которое при переходе на следующие урлы будет выдавать
 * результат:
 * /minsk - время в Минске
 * /washington - время в Вашингтоне
 * /beijing - время в Пекине
 * При решении использовать оба варианта настройки (xml и аннотации).
 */
@WebServlet(name = "TimeServlet", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class TimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        String timeZone = ServletTimeLogic.logic(path);
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(timeZone));
        response.setContentType("text/plain");
        response.getWriter().write("Current time in " + timeZone + ": " + currentTime.toString());
    }
}
