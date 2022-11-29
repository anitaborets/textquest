package main;

import main.CountServlet;
import main.Gender;
import main.LogicServlet;
import main.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


public class CountServletTest {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    User mockedUser = Mockito.spy(new User());
    HashMap<String, User> users = new HashMap<>();

    @Mock
    ServletConfig servletConfig;

    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    HttpSession session;

    @Mock
    ServletContext context;

    @BeforeEach
    public void setUp() throws Exception {
        when(request.getSession())
                .thenReturn(session);

        CountServlet countServlet = new CountServlet();

        mockedUser.setName("John");
        mockedUser.setGender("MALE");
        mockedUser.setNumberOfGames(9);
        users.put("John", mockedUser);

    }

    @Test
    public void doPostRedirect() throws IOException {
        when(request.getParameter("name")).thenReturn("test");
        when(request.getParameter("gender")).thenReturn("MALE");
        verify(response, times(0)).sendRedirect(eq("gameover.jsp"));
    }

    @Test
    void getUserWhenUserNotExists() {
        when(request.getParameter("name")).thenReturn("test");
        when(request.getParameter("gender")).thenReturn("MALE");

        User newUser = Mockito.spy(new User());
        newUser.setName("test");
        newUser.setGender("MALE");
        newUser.setNumberOfGames(1);
        users.put("test", newUser);

        assertEquals(2, users.size());
        assertEquals(1, newUser.getNumberOfGames());
    }

    @Test
    void getUserWhenUserExists() {
        when(request.getParameter("name")).thenReturn("John");
        when(request.getParameter("gender")).thenReturn("MALE");

        User newUser = Mockito.spy(new User());
        newUser = users.get("John");
        newUser.setNumberOfGames(newUser.getNumberOfGames() + 1);

        assertEquals(1, users.size());
        assertEquals(10, newUser.getNumberOfGames());
    }
}