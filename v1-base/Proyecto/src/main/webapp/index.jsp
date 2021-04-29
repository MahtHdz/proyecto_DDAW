<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--    <style type = "text / css">
    </style>-->
    <link rel="stylesheet" href="assets/css/style_login.css">
    <title>Login</title>
</head>

<body>  
    <div class="header">
        <h1>DevOps</h1>
    </div>
    <div class="login">
        <div class="login-triangle"></div>
        <h2 class="login-header">Log in</h2>
        <form class="login-container" method="POST" action="Login" onsubmit="return storageData()">
            <p><input name="email" type="email" placeholder="Email"></p>
            <p><input name="pass" type="password" placeholder="Password"></p>
            <p><button type="submit">Log in</button></p>
            <!--
                <p><input type="submit" value="Log in"></p>
            -->            
        </form>
    </div>
    <div>
        <footer></footer>
    </div>
    <script src='assets/js/libs/jquery-index.min.js'></script>
</body>
</html>