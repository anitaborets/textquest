package main;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LogicServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger("simple");
    private final QuestionsRepository questQuestions = new QuestionsRepository();
    private final AnswersRepository questAnswers = new AnswersRepository();
    private static final String GOOD_JOB = "Молодец! Переходим к следующему вопросу:";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        int index = getSelectedIndex(request);
        logger.info("LogicServlet gets index " + index);

        if (index == 0) {
            response.sendRedirect("gameover.jsp");
            out.close();
        }

        if (index == 1) {
            out.println("<h3>" + GOOD_JOB + "</h3>"
                    + "<h1>" + questQuestions.qetQuestion(index) + "</h1>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(3) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=2\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(4) + "\">" +
                    "    </FORM>");
            out.close();
        }

        if (index == 2) {
            String next = questQuestions.qetQuestion(index);
            out.println("<h3>" + GOOD_JOB + "</h3>"
                    + "<div class=\"container\">"
                    + "<h1>" + next + "</h1>"
                    + "<FORM action=\"logic?click=3\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(6) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(5) + "\">" +
                    "    </FORM>"
                    + "</div>"
            );
            out.close();
        }

        if (index == 3) {
            out.println("<h3>" + GOOD_JOB + "</h3>"
                    + "<h1>" + questQuestions.qetQuestion(index) + "</h1>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(7) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(8) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=4\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(9) + "\">" +
                    "    </FORM>"
            );
            out.close();
        }
        if (index == 4) {
            out.println("<h3>" + GOOD_JOB + "</h3>"
                    + "<h1>" + questQuestions.qetQuestion(index) + "</h1>"
                    + "<FORM action=\"logic?click=5\" method=\"POST\">\n" +
                    "       <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(11) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "       <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(10) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=5\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(12) + "\">" +
                    "    </FORM>"
            );
            out.close();
        }
        if (index == 5) {
            out.println("<h3>" + GOOD_JOB + "</h3>"
                    + "<h1>" + questQuestions.qetQuestion(index) + "</h1>"
                    + "<FORM action=\"logic?click=0\" method=\"POST\">\n" +
                    "        <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(13) + "\">" +
                    "    </FORM>"
                    + "<FORM action=\"logic?click=6\" method=\"POST\">\n" +
                    "       <INPUT type=\"submit\" class=\"btn btn-lg btn-block\" value=" + "\"" + questAnswers.qetAnswer(14) + "\">" +
                    "    </FORM>"
            );
            out.close();
        }
        if (index == 6) {
            out.println(
                    "<h1>" + questQuestions.qetQuestion(index) + "</h1>"
            );
            logger.info("game is over");
            out.close();
        }
    }

    private int getSelectedIndex(HttpServletRequest request) {
        String click = request.getParameter("click");
        boolean isNumeric = click.chars().allMatch(Character::isDigit);
        return isNumeric ? Integer.parseInt(click) : 0;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}
