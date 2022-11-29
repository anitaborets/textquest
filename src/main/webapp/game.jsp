<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="users" value="${applicationScope.get('users')}"/>
<c:set var="user" value="${applicationScope.get('user')}"/>
<html>
<!doctype html>
<html lang="ru">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/css/bootstrap.min.css"
          integrity="sha512-T584yQ/tdRR5QwOpfvDfVQUidzfgc2339Lc8uBDtcp/wYu80d7jwBgAxbyMh0a9YM9F8N3tdErpFI8iaGx6x5g=="
          crossorigin="anonymous" referrerpolicy="no-referrer">
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
            integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.1/js/bootstrap.min.js"
            integrity="sha512-UR25UO94eTnCVwjbXozyeVd6ZqpaAE9naiEUBK/A+QDbfSTQFhPGj5lOR6d8tsgbBk84Ggb5A3EkjsOgPRPcKA=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>

<br>
<br>
<h2>От кого должно исходить приглашение на первое свидание?</h2>
<br>
<div class="container">
    <FORM action="logic?click=0" method="POST">
        <INPUT type="submit" class="btn btn-lg btn-block" value="Только от мужчины">
    </FORM>
    <FORM action="logic?click=0" method="POST">
        <INPUT type="submit" class="btn btn-lg btn-block" value="От того, кто старше
        по положению или возрасту">
    </FORM>
    <FORM action="logic?click=1" method="POST">
        <INPUT type="submit" class="btn btn-lg btn-block" value="Может предложить и мужчина,
        и женщина, но лучше, если это
        сделает мужчина">
    </FORM>
</div>

<div>
    <div class="row">
        <div class="col">
            <p>Имя: ${user.getName()}
            </p>
            <p>Пол: ${user.getGender()}
            </p>
            <p>games: ${user.getCount()}
            </p>
            <b>Идентификатор сессии SessionID</b> :
            <%= session.getId() %><br><br>
        </div>
        <div class="col">
            <img src="${pageContext.request.contextPath}/images/three.jpg" alt="one">
    </div>
</div>

</body>
</html>
