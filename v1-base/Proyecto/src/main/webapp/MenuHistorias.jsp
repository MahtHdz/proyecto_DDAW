<%@page import="Pojos.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/style_usr_stories.css">
    <script src="assets/js/libs/prefixfree.min.js"></script>
    <title>Historias de Usuario</title>
</head>

<body>
    <br>
    <%
        out.println("<h1>");
        out.println("Historias de Usuario - Proyecto "+Proyecto.idProyectoActual+"");
        out.println("</h1>");
    %>
    <br>
    <!-- partial:index.partial.html -->
    <div id="carousel">
        <figure id="spinner">
        </figure>
    </div>
    <div id="create_b">
        <button onclick="create_b()">Crear</button>
    </div>
    <span id="left-arrow" style=float:left class=ss-icon onclick="galleryspin('')">&lt;</span>
    <span id="right-arrow" style=float:right class=ss-icon onclick="galleryspin('-')">&gt;</span>
    <p>Controls: cursor left and right or click on arrows to rotate, <b>Z</b> or click to toggle zoom on foreground
        image,
        <b>C</b> or hover to show/hide caption.
        <!-- partial -->
        <script src='assets/js/libs/jquery-index.min.js'></script>
        <script src="assets/js/script_usr_stories.js"></script>

</body>

</html>