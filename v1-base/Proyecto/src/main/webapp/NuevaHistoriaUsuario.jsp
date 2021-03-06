<%-- 
    Document   : NuevaHistoriaUsuario
    Created on : Apr 29, 2021, 1:42:15 PM
    Author     : maht_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='assets/css/style_new_user_story.css'>
    <title>Nueva historia de usuario</title>
</head>
<body>
    <h1>Nueva historia de usuario</h1>
    <div id="form">
        <form action="">
            <div id="story_name">
                <label for="user_stories">Historia de usuario: </label>
                <input type="text" name="user_stories" id="user_stories"><br><br>
            </div>
            <div id="fst_line">
                <label for="story_number">Numero: </label>
                <input type="number" name="story_number" id="story_number">
                <label for="story_number">(1-100)</label>
                <label id="value-label" for="value">Valor (Prioridad): </label>
                <input type="number" name="value" id="value">
                <label id="value-label-2" for="value">(1-100)</label><br><br>
            </div>
            <div id="second_line">
                <label for="date">Fecha: </label>
                <input type="date" name="date" id="date">
                <label id="deadline-label" for="deadline">Tiempo de desarrollo (costo): </label>
                <input type="number" name="deadline" id="deadline">
                <input type="radio" name="deadline-conf" id="deadline-days">
                <label id="deadline-days-label" for="deadline-days">Días</label>
                <input type="radio" name="deadline-conf" id="deadline-weeks">
                <label id="deadline-weeks-label" for="deadline-weeks">Semanas</label><br><br>
            </div>          
            <label for="description">Descripción: </label><br>
            <textarea name="description" id="description" cols="30" rows="10"></textarea><br>
            <label for="observations">Observaciones: </label><br>
            <textarea name="observations" id="observations" cols="30" rows="10"></textarea><br><br>
            <div id="buttons">
                <button type="reset">Limpiar campos</button>
                <button type="submit">Guardar</button>
                <button>Atras</button>
            </div>
        </form>
    </div>
</body>
</html>
