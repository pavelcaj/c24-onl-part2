package Lesson24.hw1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 чучуть напутал это класная работу/ домашку первое задание не буду делать
 там просто картинку вставить, я в этом задании картинку вставил. Будет
 заменой
 */
@WebServlet("/verse")
public class VerseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><style>p { margin: 3px 0; }</style><title>Verse Page</title></head>");
        out.println("<body>");
        out.println("<h1>Заголовок</h1>");
        out.println("<hr>");
        out.println("<img src='https://w.forfun.com/fetch/03/03f8cd3f6796daaacc1fe43ffb7704b7.jpeg' alt='Фотография' width='200' height='150'> ");
        out.println("<hr>");
        out.println("<p></p>");
        out.println("<p>Не позволяй душе лениться!</p>");
        out.println("<p>Чтоб в ступе воду не толочь,</p>");
        out.println("<p>Душа обязана трудиться</p>");
        out.println("<p>И день и ночь, и день и ночь!</p>");
        out.println("<br></br>");
        out.println("<p>Гони ее от дома к дому,</p>");
        out.println("<p>Тащи с этапа на этап,</p>");
        out.println("<p>По пустырю, по бурелому</p>");
        out.println("<p>Через сугроб, через ухаб!</p>");
        out.println("<br></br>");
        out.println("<p>Не разрешай ей спать в постели</p>");
        out.println("<p>При свете утренней звезды,</p>");
        out.println("<p>Держи лентяйку в черном теле</p>");
        out.println("<p>И не снимай с нее узды! после вновь линия</p>");
        out.println("<hr>");
        out.println("<p>В Заблоцкий</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

