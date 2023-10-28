package Lesson23.hw1;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Написать приложение, которое при запуске будет сообщать в консоль что оно
 * работает. На любой запрос в консоли должна отображаться запись со временем этого запроса.
 */
@WebFilter("/*")
public class RequestLoggingFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        System.out.println("Request received at " + new Date(startTime));
        chain.doFilter(req, res);

        long endTime = System.currentTimeMillis();
        System.out.println("Request completed at " + new Date(endTime));
        System.out.println("Request took " + (endTime - startTime) + " milliseconds");
    }
}
