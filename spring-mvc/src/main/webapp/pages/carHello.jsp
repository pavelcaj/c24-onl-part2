<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница автомобиля</title>
    <style>
        /*        body {
                    background-image: url('your_background_image_url.jpg');
                    background-size: cover;
                    background-position: center;
                    background-repeat: no-repeat;
                    margin: 0;
                    padding: 0;
                    font-family: Arial, sans-serif;
                }*/

        .card-container {
            display: flex;
            justify-content: center;
        }

        .card {
            text-align: left;
            margin: 10px;
            max-width: 30%;
        }

        .card:hover {
            text-decoration: none;
        }

        .card img {
            width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
<div class="card-container">
    <a href="/car/ss">
        <div class="card">
            <img src='https://1gai.ru/uploads/posts/2015-05/1432042587_13.jpg' alt="Изображение машины">
            <h4>Camaro SS </h4>
            <h4>Двигатель:</h4>
            <p>Тип: 6.2-литровый V8</p>
            <p>Мощность: Около 426 л.с.</p>
            <h4>Характеристики производительности:</h4>
            <p>Разгон до 60 миль в час: Около 4.6 секунды</p>
            <p>Максимальная скорость: Ограничена электроникой, обычно более 155 миль в час</p>
    </a>
    <a href="/car/edit/camaroSS">
        <p>редактировать данные</p>
    </a>
</div>
<div class="card">
    <a href="/car/z28">
        <img src='https://onlyhdwallpapers.com/wallpaper/cars-chevrolet-camaro-black-1F7Q.jpg' alt="Изображение машины">
        <h4>Camaro Z / 28 </h4>
        <h4>Двигатель:</h4>
        <p>Тип: 7.0-литровый V8</p>
        <p>Мощность: Около 505 л.с.</p>
        <h4>Характеристики производительности:</h4>
        <p>Разгон до 60 миль в час: Около 4 секунды</p>
        <p>Максимальная скорость: Ограничена электроникой, обычно более 180 миль в час</p>
    </a>
    <a href="/car/edit/camaroZ28">
        <p>редактировать данные</p>
    </a>
</div>
<div class="card">
    <a href="/car/z28_2010">
        <img src='https://i.pinimg.com/originals/73/5f/3c/735f3cd8cbd223d6cda7ddd54e488e09.webp'
             alt="Изображение машины">
        <h4>Camaro Z / 28 </h4>
        <h4>Двигатель:</h4>
        <p>ип: 5.7-литровый V8</p>
        <p>Мощность: Около 310 л.с.</p>
        <h4>Характеристики производительности:</h4>
        <p>Разгон до 60 миль в час: Около 5.3 секунды</p>
        <p>Максимальная скорость: Ограничена электроникой, обычно более 155 миль в час</p>
    </a>
    <a href="/car/edit/camaroZ28_2010">
    <p>редактировать данные</p>
    </a>
</div>
</div>
</body>
</html>