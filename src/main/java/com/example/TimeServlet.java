package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Servlet that shows the current server time.
 */
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        String now = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Current server time</h1>");
        resp.getWriter().println("<p>" + now + "</p>");
        resp.getWriter().println("<p><a href=\"./\">Back</a></p>");
        resp.getWriter().println("</body></html>");
    }
}
