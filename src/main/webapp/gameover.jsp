<c:set var="users" value="${applicationScope.get('users')}"/>
<c:set var="user" value="${applicationScope.get('user')}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!doctype html>
<html lang="ru">
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
<br>
<br>

<br>
<div class="container">
    <div class="alert alert-danger" role="alert">
        Game over - твое свидание окончено, ты допустил непоправимую ошибку и закончишь свою жизнь в одиночестве!
        Но ты можешь попробовать снова!
    </div>

</div>

<div class="row">

    <div class="col">
        <img src="${pageContext.request.contextPath}/images/three.jpg" alt="three">
    </div>
    <div class="col">
        <button type="button" class="btn btn-info" onclick="window.location='index.jsp'">Попробовать снова</button>
    </div>
</div>


</body>
</html>
