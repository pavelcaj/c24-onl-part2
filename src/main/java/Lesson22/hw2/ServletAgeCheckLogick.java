package Lesson22.hw2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletAgeCheckLogick {
    public static void postLogickAgeCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int age = Integer.parseInt(request.getParameter("age"));
        response.getWriter().println(age >= 18 ? "Adult" : "Minor");
    }
    public static void getLogickAgeCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ageParam = request.getParameter("age");
        if (ageParam != null) {
            try {
                int age = Integer.parseInt(ageParam);
                response.getWriter().println("Age: " + age + "<br>");
                response.getWriter().println(age >= 18 ? "Adult" : "Minor");
            } catch (NumberFormatException e) {
                response.getWriter().println("Invalid age format");
            }
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Age Check</h1>");
            out.println("<form action='' method='post'>");
            out.println("<label for='age'>Enter your age:</label>");
            out.println("<input type='number' name='age' id='age' required><br>");
            out.println("<input type='submit' value='Check Age'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}
