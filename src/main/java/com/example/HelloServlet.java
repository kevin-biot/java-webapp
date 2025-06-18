package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Simple servlet that displays a greeting message.
 * The message can be configured with the APP_MESSAGE
 * environment variable.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String message = System.getenv().getOrDefault("APP_MESSAGE",
                "Hello from the DevOps course!");

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>" + message + "</h1>");
        resp.getWriter().println("<p><a href=\"time\">Check the current server time</a></p>");
        resp.getWriter().println("</body></html>");
    }
}
