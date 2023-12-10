package lesson35;
import lesson35.DBUtil;
import lesson35.DatabaseInitializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/database")
public class DatabaseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DatabaseInitializer.initializeDatabase();
            String selectDataQuery = "SELECT * FROM users";
            try (Connection connection = DBUtil.getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectDataQuery)) {

                response.setContentType("text/html");
                PrintWriter out = response.getWriter();

                out.println("<html><body>");
                out.println("<h2>User Data:</h2>");
                out.println("<ul>");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");

                    out.println("<li>ID: " + id + ", Name: " + name + ", Age: " + age + "</li>");
                }

                out.println("</ul>");
                out.println("</body></html>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}