<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="org.apache.log4j.Logger" %>
<% Logger logger = Logger.getLogger("simple"); %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!doctype html>
<html lang="ru">
<%!
    String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }
%>

<head>
    <!-- Кодировка веб-страницы -->
    <meta charset="utf-8">
    <!-- Настройка viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

    <!-- Bootstrap CSS (Cloudflare CDN) -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/css/bootstrap.min.css"
          integrity="sha512-T584yQ/tdRR5QwOpfvDfVQUidzfgc2339Lc8uBDtcp/wYu80d7jwBgAxbyMh0a9YM9F8N3tdErpFI8iaGx6x5g=="
          crossorigin="anonymous" referrerpolicy="no-referrer">
    <!-- jQuery (Cloudflare CDN) -->
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
            integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <!-- Bootstrap Bundle JS (Cloudflare CDN) -->
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/js/bootstrap.min.js"
            integrity="sha512-UR25UO94eTnCVwjbXozyeVd6ZqpaAE9naiEUBK/A+QDbfSTQFhPGj5lOR6d8tsgbBk84Ggb5A3EkjsOgPRPcKA=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>
<% logger.info("log message from index.page");%>
<br>
<br>
<h2>Знаешь ли ты правила этикета на свидании?</h2>
<div class="container">
    <div class="row">
        <div class="col">
            Все в твоих руках.
            На первом свидании ты можешь показать себя интересным, приятным человеком и заслужить симпатию.
            Или же - продемонстрировать незнание элементарных правил приличия и навсегда отбить желание с тобой
            общаться.
            Давай проверим, будет ли у тебя второе свидание?
        </div>
        <div class="col">
            <img src="${pageContext.request.contextPath}/images/one.jpg" alt="one">
        </div>
    </div>
</div>
<br>
<br>
<div>
    <div class="row">
        <div class="col">
            <h2>Введи свое имя:</h2>
            <FORM method="POST" action="count">
                Имя: <input name="name"/>
                <br><br>
                Пол: <input type="radio" name="gender" value="female" checked/>Женщина
                <input type="radio" name="gender" value="male"/>Мужчина
                <input type="radio" name="gender" value="Undefined"/>Пока не знаю
                <br><br>
                <INPUT type="submit" class="btn btn-info" value="Начать игру">
            </form>
        </div>

        <div class="col">
            <b>Сейчас: </b>: <%out.print(getFormattedDate()); %><br><br>
            <p>Привет, ${user.getName()}
            <p>Идентификатор сессии SessionID : <%= session.getId() %><br><br>
            <p>IP : <%= request.getRemoteAddr() %><br><br>
        </div>

    </div>
</div>

</body>
</html>

