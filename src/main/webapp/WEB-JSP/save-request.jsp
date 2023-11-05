<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Форма для ввода заявки</title>
</head>
<body>
<h1>Форма для ввода заявки</h1>
<form name="requestForm" action="SaveRequestServlet" method="post" onsubmit="return validateForm()">
    Ваше имя: <input type="text" name="name"><br>
    Ваш email: <input type="text" name="email"><br>
    Ваша заявка: <textarea name="request"></textarea><br>
    <input type="submit" value="Сохранить заявку">
</form>
</body>
<script>
    function validateForm() {
        var nameInput = document.forms["requestForm"]["name"];
        var emailInput = document.forms["requestForm"]["email"];
        var requestInput = document.forms["requestForm"]["request"];
        var isValid = true;
        if (nameInput.value === "") {
            nameInput.style.borderColor = "red";
            isValid = false;
        } else {
            nameInput.style.borderColor = "";
        }
        if (emailInput.value === "") {
            emailInput.style.borderColor = "red";
            isValid = false;
        } else {
            emailInput.style.borderColor = "";
        }
        if (requestInput.value === "") {
            requestInput.style.borderColor = "red";
            isValid = false;
        } else {
            requestInput.style.borderColor = "";
        }
        if (!isValid) {
            alert("Пожалуйста, заполните все обязательные поля.");
        }
        return isValid;
    }
</script>
</html>
