package Lesson22.hw2;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 Создать сервлет который на вход принимает возраст, а в ответе возвращает
 информацию, совершеннолетний или нет  .
 */
@WebServlet("/age-check")
public class AgeCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int age = Integer.parseInt(request.getParameter("age"));

        if (age >= 18) {
            response.getWriter().println("Adult");
        } else {
            response.getWriter().println("Minor");
        }
    }
}