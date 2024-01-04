<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактирование информации о машине: ${carInfo.modelName}</title>
</head>
<body>
<h2>Редактирование информации о машине: ${carInfo.modelName}</h2>

<form method="post" th:action="@{/edit/{modelName}(modelName=${carInfo.modelName})}" th:object="${carInfo}">

    <label for="engineType">Двигатель:</label>
    <input type="text" id="engineType" name="engineType" value="${carInfo.engineType}" required>

    <label for="horsepower">Мощность:</label>
    <input type="number" id="horsepower" name="horsepower" value="${carInfo.horsepower}" required>

    <label for="acceleration">Разгон:</label>
    <input type="number" step="0.1" id="acceleration" name="acceleration" value="${carInfo.acceleration}" required>

    <label for="maxSpeed">Максимальная скорость:</label>
    <input type="number" id="maxSpeed" name="maxSpeed" value="${carInfo.maxSpeed}" required>

    <button type="submit">Сохранить изменения</button>
</form>

<br>
<a href="${pageContext.request.contextPath}/car">Вернуться на главную страницу</a>
</body>
</html>