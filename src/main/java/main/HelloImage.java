package main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloImage extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/index.jsp");
        view.forward(request, response);
    }
}
