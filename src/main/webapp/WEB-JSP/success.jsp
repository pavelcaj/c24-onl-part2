<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 05.11.2023
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заявка успешно сохранена</title>
</head>
<body>
<h1>Заявка успешно сохранена</h1>
<p>Заявка успешно сохранена. Данные из формы:</p>
<ul>
    <li>Имя: ${param.name}</li>
    <li>Email: ${param.email}</li>
    <li>Заявка: ${param.request}</li>
</ul>
</body>
</html>
