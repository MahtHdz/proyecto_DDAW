<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='assets/css/libs/normalize.min.css'>
    <link rel='stylesheet' href='assets/css/libs/fontawesome-app.css'>
    <link rel='stylesheet' href='assets/css/libs/all.css'>
    <!--
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:400,700'>
    -->
    <link rel="stylesheet" href="assets/css/style_project.css">
    <title>Poyecto actual</title>
</head>
<body>
    <div class="options">
        <!--Checar optionBackground para que se muestren las imágenes-->
        <div id="cards" class="option active">
            <div class="shadow"></div>
            <div class="label">
                <div class="icon">
                    <img src="assets/images/crc_cards_icon.png" alt="">
                </div>
                <div class="info">
                    <div class="main"><a href="MenuTarjetasCRC.jsp">Tarjetas CRC</a></div>
                    <div class="sub">Edita y crea tarjetas CRC.</div>
                </div>
            </div>
        </div>
        <div id="stories" class="option">
            <div class="shadow"></div>
            <div class="label">
                <div class="icon">
                    <img src="assets/images/user_stories_icon.png" alt="">
                </div>
                <div class="info">
                    <div class="main"><a href="user-stories/menu.html">Historias de usuario</a></div>
                    <div class="sub">Edita y crea historias de usuario.</div>
                </div>
            </div>
        </div>
    </div>
    <!-- 
        <a href="http://victorofvalencia-blog.tumblr.com" target="_blank" class="credit">Photos from Victor of Valencia on tumblr</a>
    -->  
    <script src='assets/js/libs/jquery-project.min.js'></script>
    <script src="assets/js/script_project.js"></script>
</body>
</html>