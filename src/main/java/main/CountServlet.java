package main;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;


public class CountServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger("simple");
    private static HashMap<String, User> users = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        User user = new User();
        user = getUser(name, gender, user);
        session.setAttribute("user", user);
        logger.info(session.getAttribute(user.getName()));
        logger.info(users);
        responce.sendRedirect("game.jsp");
    }

    private User getUser(String name, String gender, User user) {
        if (users.containsKey(name)) {
            logger.info("user is exists in " + users.get(name));
            user = users.get(name);
            user.setNumberOfGames(user.getNumberOfGames() + 1);
        } else {
            user.setName(name);
            user.setGender(gender);
            user.setNumberOfGames(1);
            users.put(name, user);
            logger.info("user was put in users " + user.getName());
        }
        return user;
    }

}
