package lesson32;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/frontController")
public class FrontController extends HttpServlet {
    private Dispatcher dispatcher;
    @Override
    public void init() throws ServletException {
        super.init();
        dispatcher = new Dispatcher();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dispatchRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dispatchRequest(request, response);
    }
    private void dispatchRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getParameter("path");
        trackRequest(path);
        if (isAuthenticUser()) {
            dispatcher.dispatch(path, request, response);
        }
    }
    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }
    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
}