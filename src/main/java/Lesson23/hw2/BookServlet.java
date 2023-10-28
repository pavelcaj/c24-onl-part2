package Lesson23.hw2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Создать 2 эндпоинта:
 * /book - который будет скачивать с сервера клиенту любую книгу.
 * /load-book - который позволит загружать свои книги на сервер.
 */
@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filePath = "file:///D:/c24-onl-part2/c24-onl-part2/src/main/resources/static/book/Java_Polnoe_rukovodstvo.pdf";
        File file = new File(filePath);
        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition", "attacment; filename=\"Java_Polnoe_rukovodstvo.pdf\"");

        try (FileInputStream fileInputStream = new FileInputStream(file); OutputStream out = resp.getOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}