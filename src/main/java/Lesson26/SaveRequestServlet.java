package Lesson26;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/SaveRequestServlet")
public class SaveRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =  request.getParameter("name");
        String email =  request.getParameter("email");
        String requestText =  request.getParameter("request");
        if (name != null && !name.isEmpty() && email != null && !email.isEmpty() && requestText != null && !requestText.isEmpty()) {
            response.sendRedirect("/WEB-JSP/success.jsp");
        } else {
            response.sendRedirect("/WEB-JSP/save-request.jsp");
        }
    }
}
