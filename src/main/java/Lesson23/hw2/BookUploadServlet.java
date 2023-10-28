package Lesson23.hw2;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;

@WebServlet("/load-book")
@MultipartConfig
public class BookUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        try {
            Part filePart = req.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            File bookFile = new File("D:/c24-onl-part2/c24-onl-part2/src/main/resources/static/book/" + fileName);

            try (InputStream fileContent = filePart.getInputStream()) {
                Files.copy(fileContent, bookFile.toPath());
            }
            resp.getWriter().write("The book has been uploaded successfully: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("Error loading the book");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Upload a Book</h1>");
        out.println("<form action='/c24_onl_part2_war_exploded/load-book' method='post' enctype='multipart/form-data'>");
        out.println("<label for='file'>Choose a book:</label>");
        out.println("<input type='file' name='file' id='file' required><br>");
        out.println("<input type='submit' value='Upload Book'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
