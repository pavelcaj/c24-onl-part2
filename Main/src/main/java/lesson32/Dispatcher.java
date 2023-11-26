package lesson32;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dispatcher {
    public void dispatch(String request, HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        if (request.equalsIgnoreCase("VERSE")) {
            forwardToVerseServlet(httpRequest, httpResponse);
        } else if (request.equalsIgnoreCase("TEST")) {
            forwardToTestServlet(httpRequest, httpResponse);
        } else {
            showNotFoundError(httpResponse);
        }
    }

    private void forwardToVerseServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Forwarding to VerseServlet");
        request.getRequestDispatcher("/verse").forward(request, response);
    }

    private void forwardToTestServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Forwarding to TestServlet");
        request.getRequestDispatcher("/test").forward(request, response);
    }

    private void showNotFoundError(HttpServletResponse response) throws IOException {
        System.out.println("Error: Unknown request");
        response.sendError(HttpServletResponse.SC_NOT_FOUND, "Not Found");
    }
}