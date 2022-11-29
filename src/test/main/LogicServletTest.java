package main;

import main.AnswersRepository;
import main.LogicServlet;
import main.QuestionsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class LogicServletTest {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);

    @Mock
    ServletConfig servletConfig;

    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    HttpSession session;

    @Mock
    ServletContext context;

    @Mock
    QuestionsRepository questQuestions;

    @Mock
    AnswersRepository questAnswers;

    @BeforeEach
    void setUp() throws ServletException {
        when(request.getParameter(eq("click")))
                .thenReturn("0");

        when(request.getSession())
                .thenReturn(session);
        LogicServlet logicServlet = new LogicServlet();
    }

    @Test
    void doGet() throws IOException {
        verify(response, times(0)).sendRedirect(eq("gameover.jsp"));
    }

}