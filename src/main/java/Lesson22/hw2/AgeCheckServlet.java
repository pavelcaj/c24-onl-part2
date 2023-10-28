package Lesson22.hw2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Создать сервлет который на вход принимает возраст, а в ответе возвращает
 * информацию, совершеннолетний или нет  .
 */
@WebServlet("/age-check")
public class AgeCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       ServletAgeCheckLogick.postLogickAgeCheck(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ServletAgeCheckLogick.getLogickAgeCheck(request, response);

    }
}